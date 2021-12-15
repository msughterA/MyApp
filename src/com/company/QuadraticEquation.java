package com.company;

import java.util.Scanner;
import java.math.*;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Prompt user to enter a,b,c
        System.out.print("Enter the coefficients a, b, c: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        //Determine the discriminant
        double discriminant=(b*b)-(4*a*c);
        if(discriminant<0){
            System.out.println("Equation has no  real roots");
        }
        else if(discriminant==0){
            //compute the root
            double r1=(-b + Math.sqrt(discriminant))/(2*a);
            System.out.println("The root of the equation is:"+r1);
        }
        else{
            double r1=(-b + Math.sqrt(discriminant))/(2*a);
            double r2=(-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The roots of the equation are "+r1+" and " +r2);
        }
    }
}
