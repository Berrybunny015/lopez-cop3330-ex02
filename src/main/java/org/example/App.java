/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is the input string? "); //output #1

        Scanner input = new Scanner(System.in); //input
        String stringName = input.next();

        int numChars = stringName.length();

        System.out.println("\n" + stringName + " has " + numChars + " characters."); //output #2

    }
}
