package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentGradeCalculator {
    private int numberOfSubjects;
    private Double score;
    private Double sum;
    private String scores;
    private int scoreType;
    DecimalFormat decimalFormat;
    public  void calculateAvgScore()
    {
        System.out.println("         Level 1 Task  3");
        System.out.println("");
        sum=0.0;
        scores="";
        Scanner scanner=new Scanner(System.in);
        decimalFormat=new DecimalFormat("#.00");
        System.out.println("------- -- ------- ----- ----------");
        System.out.println("Welcome to Student Grade Calculator");
        System.out.println("------- -- ------- ----- ----------");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter How many Subjects You Have");
        numberOfSubjects=scanner.nextInt();
        System.out.println("Choose  Score  Type ");
        System.out.println("(1) -->        Marks");
        System.out.println("(2) -->       Grades");
        System.out.println("(Any) --> Percentage");
        scoreType=scanner.nextInt();
        for(int i=1;i<=numberOfSubjects;i++)
        {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Enter Subject "+i+" Score");
            score=scanner1.nextDouble();
            sum=sum+score;
            scores=scores+" ," +score;

        }
        System.out.println("your Scores are"+scores);
        System.out.println("Here is your Avg Score "+decimalFormat.format((sum/numberOfSubjects))+getScoreType(scoreType));
        System.out.println("");

    }
    private String getScoreType(int i){
        String result;
        switch (i)
        {
            case 1:
                result="M";
                break;
            case 2:
                result="GPA";
            default:
                result="%";
                break;
        }
        return result;
    }
}
