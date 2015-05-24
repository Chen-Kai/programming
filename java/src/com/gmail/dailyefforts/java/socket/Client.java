package com.gmail.dailyefforts.java.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter printer = null;
        try {
            socket = new Socket("localhost", 8888);
            printer = new PrintWriter(socket.getOutputStream());
            printer.print("I'm a client.");
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printer != null) {
                printer.close();
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
