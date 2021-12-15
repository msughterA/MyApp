package com.company;

import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args){
        //Get the inputs
        Scanner input=new Scanner(System.in);
        //Prompt the user to enter a,b,c,d,e,f
        System.out.print("Enter a, b, c, d, e, f:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();

        //Calculate Determinant ad-bc
        double Determinant=(a*d)-(b*c);

        if(Determinant==0){
            System.out.println("The Equation has no solution");
        }
        else{
            double x=((e*f)-(b*d))/Determinant;
            double y=((a*f)-(c*e))/Determinant;
            System.out.println("x is "+x+" and y is " +y);
        }
    }}
