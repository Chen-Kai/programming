package com.gmail.dailyefforts.java.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        BufferedReader reader = null;
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("Server is running...");
            socket = serverSocket.accept();
            System.out.println(socket);
            if (socket != null) {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = reader.readLine();
                while (str != null) {
                    System.out.println("Server: " + str);
                    str = reader.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
