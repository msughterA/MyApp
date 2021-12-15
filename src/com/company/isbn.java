package com.company;

import java.util.Scanner;

public class isbn {
    public static void main(String[] args){
        //Get the input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbnInteger=input.nextInt();
        String isbn="" +isbnInteger;

        int isbnLength=isbn.length();

        switch (isbnLength){
            case 1:
                int v1=isbnInteger%11;
                System.out.println("The ISBN-10 number is 00000000"+isbnInteger+v1);
                break;
            case 2:
                int d9=isbn.charAt(1);
                int d8=isbn.charAt(1);
                int v2=((d9*9)+(d8*8))%11;
                System.out.println("The ISBN-10 number is 0000000"+isbnInteger+v2);
                break;


        }

    }
}
