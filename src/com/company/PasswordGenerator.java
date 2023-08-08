package com.company;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    private String randomSymbols;
    private Scanner scanner;
   private int lenthOfPassWord;
   private String password;
   private Random random;
   private int duplicateLen;
    public void generatePassword(){
        System.out.println("         Level 1 Task  4");
        System.out.println("");

        randomSymbols="3F)h9I~G0U*cQqS#bJ2i5$rB(Zw1XoR4lK&mDnVjA7vH*Lp@z8MgOyka%ExN6eYtW_Tu+Cs!";
        scanner=new Scanner(System.in);
        System.out.println("------- -- ------ -------- ---------");
        System.out.println("Welcome to Random Password Generator");
        System.out.println("------- -- ------ -------- ---------");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter Length Of The Password");
        lenthOfPassWord=scanner.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Your Password is.....");
        System.out.println("");
        System.out.println(generate());


    }
    private String generate()
    {
        password="";
        int randomNumber;
        random=new Random();
        duplicateLen=lenthOfPassWord;
        while(duplicateLen>0)
        {
            randomNumber=random.nextInt(lenthOfPassWord);
            password+=randomSymbols.charAt(randomNumber);
            duplicateLen-=1;
        }
        return password;
    }


}
