package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverter {
    double temperature;
    int unit;
    Scanner scanner;
    DecimalFormat decimalFormat;
   public void  convertTemp()
    {
        decimalFormat=new DecimalFormat("#.0");
        System.out.println("         Level 1 Task  1");
        scanner=new Scanner(System.in);
        System.out.println("------- -- ----------- ----------");
        System.out.println("Welcome to Temperature Calculator");
        System.out.println("------- -- ----------- ----------");

        System.out.println("enter temperature :");
        temperature =scanner.nextFloat();
        System.out.println("");
        System.out.println("enter UNIT");
        System.out.println("(1) --> Degree Celsius");
        System.out.println("(2) -->     Fahrenheit");
        System.out.println("(3) -->         Kelvin");
        unit=scanner.nextInt();

        switch (unit)
        {
            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("You Entered "+temperature+" Degree Celsius");
                System.out.println("");
                System.out.println("Changing  "+temperature+" Degree Celsius To Fahrenheit And Kelvin");
                System.out.println("");
                changeToFahrenheitAndKelvin();
                System.out.println("");
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("You Entered "+temperature+" Fahrenheit");
                System.out.println("Changing  "+temperature+" Fahrenheit To Degree Celsius And Kelvin");
                changeToDegreeAndKelvin();
                System.out.println("");
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("You Entered "+temperature+" Kelvin");
                System.out.println("Changing  "+temperature+" Kelvin To Degree Celsius And Fehrenheit");
                changeToDegreeAndFohrenheit();
                System.out.println("");
                System.out.println("");
            default:
                System.out.println("Try Again And Enter Correct UNIT");
        }


    }

    private void changeToDegreeAndFohrenheit() {
        double degree;
        double fohrenheit;
        degree=(temperature-273.15);
        fohrenheit=(((temperature-273.15)*5)/9)+32;
        System.out.println("");
        System.out.println(temperature+"K Kelvin is Equivalent To ");
        System.out.println("");
        System.out.println("Degree "+format(degree)+"C");
        System.out.println("");
        System.out.println("Fohrenheit  "+format(fohrenheit)+"F ");

    }

    private void changeToDegreeAndKelvin() {
       double degree;
       double kelvin;
        degree=(((temperature-32)*5)/9);
        kelvin=(((temperature-32)*5)/9)+273.15;
        System.out.println("");
        System.out.println(temperature+"F Fahrenheit is Equivalent To ");
        System.out.println("");
        System.out.println("Degree "+format(degree)+"C");
        System.out.println("");
        System.out.println("Kelvin  "+format(kelvin)+"K ");


    }

    private void changeToFahrenheitAndKelvin() {
       double fehrenheit;
       double kelvin;
       fehrenheit=((temperature*9)/5)+32;
       kelvin=temperature+273.15;
        System.out.println("");
        System.out.println(temperature+"C is Equivalent To ");
        System.out.println("");
        System.out.println("Fehrenheit "+format(fehrenheit)+"F");
        System.out.println("");
        System.out.println("Kelvin  "+format(kelvin)+"K ");
    }
    private String format(double num){
       return decimalFormat.format(num);
    }



}
