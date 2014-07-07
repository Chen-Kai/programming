package com.gmail.dailyefforts.java.text;

import java.io.*;

public class AppMain {

    public static void main(String[] args) {
        final CharSequence a = "a";
        // 查看字符a的unicode值
        final int unicode = Character.codePointAt(a, 0);
        System.out.println("Unicode: 0x" + Integer.toHexString(unicode));
        File file = new File(new File(".").getParent(), "zh_CN.txt");
        System.out.println(file.getAbsoluteFile() + ", " + file.exists());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println("line: " + line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
