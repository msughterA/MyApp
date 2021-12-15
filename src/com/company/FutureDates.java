package com.company;

import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day=input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed=input.nextInt();
        //character test
        //This is a sample character
        char letter='\u0041';
        //Determine the day of the week
        int dayOfWeek=(day+daysElapsed)%7;
        switch (dayOfWeek){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}