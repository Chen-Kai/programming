package com.gmail.dailyefforts.java.callback;

import java.util.ArrayList;
import java.util.List;

interface OnCallListener {
	void onCall();
}

// Don't call me, I will call you back.
class Server {
	private List<Client> mClients;

	public Server() {
		mClients = new ArrayList<Client>();
	}

	public void add(Client client) {
		mClients.add(client);
	}

	public void call() {
		Client client = mClients.get(0);
		if (client != null) {
			client.call();
			mClients.remove(0);
		}
	}

	public int size() {
		return mClients == null ? 0 : mClients.size();
	}
}

class Client {
	private OnCallListener mListener;
	private int mId;

	public Client(int id) {
		mId = id;
	}

	public int getId() {
		return mId;
	}

	public void setOnCallListener(OnCallListener listener) {
		mListener = listener;
	}

	public void call() {
		mListener.onCall();
	}
}

public class AppMain {
	public static void main(String[] args) {
		Server server = new Server();
		Client client1 = new Client(1);
		client1.setOnCallListener(new OnCallListener() {
			@Override
			public void onCall() {
				System.out.println("client1 is called");
			}
		});

		server.add(client1);

		Client client2 = new Client(2);
		client2.setOnCallListener(new OnCallListener() {
			@Override
			public void onCall() {
				System.out.println("client2 is called");
			}
		});
		server.add(client2);

		Client client3 = new Client(3);
		client3.setOnCallListener(new OnCallListener() {
			@Override
			public void onCall() {
				System.out.println("client3 is called");
			}
		});
		server.add(client3);

		while (server.size() > 0) {
			server.call();
		}
	}
}
