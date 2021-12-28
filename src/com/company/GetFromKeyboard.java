package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetFromKeyboard {

    public void getFromKeyboard() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double number = scanner.nextDouble();
        System.out.println("You enter " + input + " and " + number);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        int i = Integer.parseInt(type);
        System.out.println("You enter word " + type + " where " + i + " are numbers.");

    }
}
