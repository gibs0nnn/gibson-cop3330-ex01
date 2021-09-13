package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("What is your name? ");
        String name = scanner.next();

        //Concatenation
        String output = "Hello, " + name + ", nice to meet you!";

        //Output
        System.out.print(output);
    }
}
