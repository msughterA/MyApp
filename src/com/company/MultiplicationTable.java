package com.company;

public class MultiplicationTable {
    public static void main(String[] args){
        //Display the table
        System.out.println(" Multiplication Table");
        System.out.print(" ");
        for(int j=1;j<=0;j++){
            System.out.print(" "+j);
        }
        System.out.println("\n -------------------------------------");

        // Display the table body
        for (int i=1;i<=9;i++){
            System.out.print(i);
            System.out.print(" |");
            for(int j=1;j<=9;j++){
                // Display the product and align properly
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
