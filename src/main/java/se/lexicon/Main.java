package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Exercise 1.
        System.out.println("Hello\nSami!");

        // Exercise 2.
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year.
        boolean isLeapYear = isLeapYear(year);
        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");

        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Divisible by 100 but not by 400 -> not a leap year.
                return year % 400 == 0; // Divisible by 400 -> is a leap year.
            } else {
                return true; // Divisible by 4 but not by 100 -> is a leap year.
            }
        } else {
            return false; // Not divisible by 4 -> not a leap year.
        }
    }


}