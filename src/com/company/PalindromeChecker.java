package com.company;

import java.util.Scanner;

public class PalindromeChecker {
   private String orginal;
   private String palindromeString;
   private String orginalDuplicate;
   private Scanner scanner;
    public  void check()
    {
        System.out.println("         Level 1 Task  2");
        System.out.println("");
        scanner=new Scanner(System.in);
        System.out.println("------- -- ---------- -------");
        System.out.println("Welcome to Palindrome Checker");
        System.out.println("------- -- ---------- -------");

        System.out.println("Enter Something That  You Want To Check");
        orginal=scanner.nextLine();
        if (isPalindrome())
        {
            System.out.println(orginal+" is a palindrome");
        }
        else
        {
            System.out.println(orginal+" is not a palindrome");
        }


        
    }

    private boolean isPalindrome() {
        boolean result;
        palindromeString="";
        orginalDuplicate="";
        for (char c: orginal.toCharArray()) {
            if(c != ' ')
            {
                palindromeString=c+palindromeString;
                orginalDuplicate=orginalDuplicate+c;
            }

        }
        if(palindromeString.equals(orginalDuplicate))
        {
             result =true;
        }
        else
        {
            result=false;
        }
        return result;
    }

}
