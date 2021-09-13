/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;




public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.print("How many euros are you exchanging? ");
        double euros = scanner.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = scanner.nextDouble();
        System.out.println();
        double result = 0.0;

        double dollars = App(euros, rate, result);

        System.out.println(euros + " euros at an exchange rate of " + rate + " is \n" + df.format(dollars) + " U.S. dollars.");

        scanner.close();
    }


    private static double App(double euros, double rate, double result) {
        return euros * rate;
    }
}



