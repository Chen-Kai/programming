package com.gmail.dailyefforts.algrithm.search;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("vhow.me");
            System.out.println(Arrays.toString(inetAddress.getAddress()));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
