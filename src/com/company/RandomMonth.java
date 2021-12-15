package com.company;

import java.util.Scanner;

public class RandomMonth {
    public static void main(String[] args){
        //Generate the random number
        int randNumber=(int)(Math.random()*100 + 1);
        randNumber=randNumber=randNumber%13;
        //using a switch statement to determine month
        switch (randNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Februaru");
                break;

            case 3:
                System.out.println("Match");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
