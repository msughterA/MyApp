package com.company;

import java.util.Scanner;

public class mypractice {
    public static void main(String[] args){
        //Get inputs from the user a,b,c
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a b c:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        //Calculate the Discriminant

        double Discriminant=(b*b)-(4*a*c);

        if(Discriminant>0){
            double r1=(-b + Math.pow(Discriminant,0.5))/(2*a);
            double r2=(-b - Math.pow(Discriminant,0.5))/(2*a);

            System.out.println("The equation has two roots "+r1+ " and "+r2);
        }
        else if(Discriminant==0){
            double r1=(-b + Math.pow(Discriminant,0.5))/(2*a);
            System.out.println("The equation has one root"+r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }


    }
}
