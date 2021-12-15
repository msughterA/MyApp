package com.company;

import java.util.Scanner;

public class MontaryUnits {
    public static void main(String[] args){
        //Create a scanner
        Scanner input=new Scanner(System.in);

        //Recieve the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount=input.nextDouble();
        int remainingAmount=(int)(amount*100);

        //Find the number of one dollars

        int numberOfOneDollars=remainingAmount/100;
        remainingAmount=remainingAmount%100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters=remainingAmount/25;
        remainingAmount=remainingAmount%25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes=remainingAmount/10;
        remainingAmount=remainingAmount%10;

        //Find the number of nickels in the remaining amount
        int numberOfNickels=remainingAmount/5;
        remainingAmount=remainingAmount%5;

        int numberOfPennies=remainingAmount;

        //Display the results
        System.out.println("Your amount "+ amount + " consists of ");
        if(numberOfOneDollars>1){
            System.out.println(" " + numberOfOneDollars + " dollars" );
        }
        else {
            System.out.println(" " + numberOfOneDollars + " dollar" );
        }
        if(numberOfQuarters>1){
            System.out.println(" " + numberOfQuarters + " quaters" );
        }
        else {
            System.out.println(" " + numberOfQuarters + " quater" );
        }
        if(numberOfDimes>1){
            System.out.println(" " + numberOfDimes + " dimes" );
        }
        else {
            System.out.println(" " + numberOfDimes + " dime" );
        }
        if(numberOfNickels>1){
            System.out.println(" " + numberOfNickels + " nickels" );
        }
        else {
            System.out.println(" " + numberOfNickels + " nickel" );
        }
        if(numberOfPennies>1){
            System.out.println(" " + numberOfPennies + " pennies" );
        }
        else {
            System.out.println(" " + numberOfPennies + " pennie" );
        }
        //
    }
}
