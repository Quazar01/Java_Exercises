package se.lexicon;

import java.util.Random;
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

        // Exercise 3.
        //Sum
        System.out.printf("Sum of %d + %d = %d%n", 45, 11, 45 + 11 );
        // Multiplication
        System.out.printf("Multiplication of %d * %d = %d%n", 12, 4, 12 * 4);
        // Division
        System.out.printf("Division of %d + %d = %d%n", 24, 6, (24 / 6) );
        // Subtraction
        System.out.printf("Subtraction of %d + %d = %d%n", 55, 12, 55 - 12 );

        // Exercise 4
        average(23, 11, 77);

        // Exercise 5
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        // Exercise 6
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        mathOperations(firstNumber,secondNumber);

        // Exercise 7
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        seconds_to_time(seconds);

        // Exercise 8
        Random random = new Random();

        int targetNumber = random.nextInt(500) + 1;

        // Inform the user about the range
        System.out.println("I have selected a random number between 1 and 500.");
        System.out.println("Try to guess the number!");

        // Declare user's guess
        int guess;
        // Loop until the user guesses the correct number
        do {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // Provide feedback
            if (guess < targetNumber) {
                System.out.println("Your guess was too small.");
            } else if (guess > targetNumber) {
                System.out.println("Your guess was too big.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (guess != targetNumber);

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

    public static void average(int a, int b, int c){
        System.out.printf("(%d + %d + %d)/3 = %d%n", a, b, c, ((a + b + c)/3) );
    }

    public static void mathOperations(int a, int b) {
        //Sum
        System.out.printf("Sum of %d + %d = %d%n", a, b, a + b );
        // Multiplication
        System.out.printf("Multiplication of %d * %d = %d%n", a, b, a * b);
        // Division
        System.out.printf("Division of %d + %d = %d%n", a, b, a / b );
        // Subtraction
        System.out.printf("Subtraction of %d + %d = %d%n", a, b, a - b );
    }

    public static void seconds_to_time(int seconds){

        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int remainingSeconds = remainder % 60;

        System.out.printf("%d:%d:%d", hours, minutes, remainingSeconds);
    }


}