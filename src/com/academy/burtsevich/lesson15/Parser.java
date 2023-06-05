package com.academy.burtsevich.lesson15;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser implements Runnable {
    private final String url;
    private final String fileName;

    public Parser(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    String sep = File.separator;
    String fullPath = System.getProperty("user.dir") + sep +
            "src" + sep + "com" + sep + "academy" + sep + "burtsevich" + sep +
            "lesson15" + sep + "parsing" + sep;


    void parse() {

        try {
            URL url1 = new URL(url);
            StringBuilder text = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))
            ) {
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(reader.readLine() + "\n");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (BufferedWriter br = new BufferedWriter(new FileWriter(fullPath + fileName))) {
                br.write(text.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        parse();
    }
}
