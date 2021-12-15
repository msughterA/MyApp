package com.company;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Prompt user to enter the their Score
        System.out.print("Enter your Exam Score");
        int score=input.nextInt();

        //Check the conditions
        if(score < 0 || score >100){
            System.out.println("invalid score");
        }
        else{
            if(score >= 70){
                System.out.println("A");
            }
            else if( score>=60){
                System.out.println("B");
            }
            else if(score >=50){
                System.out.println("C");
            }
            else if(score>=45){
                System.out.println("D");
            }
            else if(score>=40){
                System.out.println("E");
            }
            else{
                System.out.println("F");
            }
        }

    }
}
