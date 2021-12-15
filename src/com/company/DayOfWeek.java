package com.company;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        //get the inputs
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year:");
        int year=input.nextInt();
        //Enter the day of the month
        System.out.print("Enter month: 1-12:");
        int month=input.nextInt();
        System.out.print("Enter the day of the month: 1-31");
        //Enter the day of the month
        int dayOfmonth=input.nextInt();
        //Convert January and February to months 13 an 14 of the previous year
        if(month==1||month==2){
            //using the tenary operator for assignment
            month=(month==1)?13:14;
            //decrement to the previous year
            year=year-1;
        }
        //Calculate the day of the week
        int dayOfWeek=(dayOfmonth+(26*(month+1))/10+(year%100)
        +(year%100)/4 + (year/100)/4+5*(year/100))%7;

        //Display the result
        switch (dayOfWeek){
            case 0:
                System.out.println("Day of Week is Saturday");
                break;
            case 1:
                System.out.println("Day of Week Sunday");
                break;
            case 2:
                System.out.println("Day of Week Monday");
                break;
            case 3:
                System.out.println("Day of Week Tuesday");
                break;
            case 4:
                System.out.println("Day of Week Wednesday");
                break;
            case 5:
                System.out.println("Day of Week Thurday");
                break;
            case 6:
                System.out.println("Day of Week Friday");
                break;
        }

    }
}
