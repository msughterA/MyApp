package com.company;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input=new Scanner(System.in);
        int decimal=input.nextInt();

        // Convert decimal to hex
        String hex="";

        while(decimal !=0){
            int hexValue=decimal%16;

            //Convert decimal to value to a hex digit
            char hexDigit=(0<=hexValue && hexValue<=9)?
                    (char)(hexValue + '0'):(char)(hexValue -10 + 'A');

            hex=hexDigit + hex;
            decimal=decimal/16;
        }

        System.out.println("The hex number is"+ hex);
    }
}
