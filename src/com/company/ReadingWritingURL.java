package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class ReadingWritingURL {

    public static void main(String[] args) throws IOException {

        URL oracle = new URL("https://www.i.ua/");
        URLConnection connection = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
//        in.close();

//        Many HTML pages contain forms — text fields and other GUI objects that let you enter data to send to the server:
//        - Create a URL.
//        - Retrieve the URLConnection object.
//        - Set output capability on the URLConnection.
//        - Open a connection to the resource.
//        - Get an output stream from the connection.
//        - Write to the output stream.
//        - Close the output stream.
//
//        URL oracle = new URL("https://www.i.ua/");
//        URLConnection connection = oracle.openConnection();
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String inputLine;

        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        String stringToReverse = "";
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write("string=" + stringToReverse);
        out.close();

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
//        in.close();

    }


}
