package com.company;


import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;

public class Main {
    //private String myName="Msughter";
    public static void main(String[] args) {
	// write your code here
        //primitive types are used for storing simple values
        //primitive types are copied by their values
        byte age=30; //primitive type
        long viewsCount=40_000; //primitive type
        float price=10.99F; //primitive type
        char letter='A'; //primitive type
        boolean isEligible=true; //primitive type
         //reference types are used for storing complex values
        //When dealing with reference types with allocate memory using the new keyword
        //reference types are copied by their reference or address


        Date now =new Date(); //reference type
        //now holds the address of the data
        now.getTime();
        //System.out.println(now);
        printName();

        Point point1= new Point(1,1);
        Point point2=point1;
        point1.x=2;
        //System.out.println(point2);
        int[] numbers=new int[15];
        //reference the items
        numbers[0]=0;
        double x=1.1;
        //double y=x+2;//Implicit casting
        int y=(int)x+2;
        System.out.println(y);

        int result=Math.max(1,2);
        System.out.println(result);

        //NumberFormat currency=new NumberFormat()
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String res=currency.format(1234567.891);
        System.out.println(res);
    }

    private static void printName(){
        System.out.println("I am fine");
    }
}

