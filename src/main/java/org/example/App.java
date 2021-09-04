package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        //variable declaration
        int numChars = 0;

        System.out.println("\nWhat is the input string? "); //output #1

        Scanner input = new Scanner(System.in); //input
        String stringName = input.next();

        numChars = stringName.length();

        System.out.println(stringName + " has " + numChars + " characters."); //output #2

    }
}
