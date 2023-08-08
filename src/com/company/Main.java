package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter=new TemperatureConverter();
        PalindromeChecker palindromeChecker=new PalindromeChecker();
        PasswordGenerator passwordGenerator=new PasswordGenerator();
        StudentGradeCalculator studentGradeCalculator=new StudentGradeCalculator();

	// write your code here
        System.out.println("------- -- -------- ---- ---------- ----- -");
        System.out.println("Welcome to Cognifyz java Internship Level 1");
        System.out.println("------- -- -------- ---- ---------- ----- -");
        System.out.println("");
        int choice=0;
        boolean isAlive=true;
        while (isAlive)
        {
            System.out.println("Choose Tasks...");
            System.out.println("(1) ---> Temperature     Converter");
            System.out.println("(2) ---> Palindrome        Checker");
            System.out.println("(3) ---> Student Geade  Calculator");
            System.out.println("(4) ---> Random Password Generator");
            System.out.println("(5) --->                      Exit");
            Scanner scanner=new Scanner(System.in);

            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    temperatureConverter.convertTemp();
                    break;
                case 2:
                    palindromeChecker.check();
                    break;
                case 3:
                    studentGradeCalculator.calculateAvgScore();

                    break;
                case 4:
                    passwordGenerator.generatePassword();
                    break;
                default:
                    System.out.println("You Entered Wrong  Try Again ");
                    break;
            }



        }



    }
}
