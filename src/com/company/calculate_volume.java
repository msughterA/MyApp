package com.company;

import java.util.Scanner;

public class calculate_volume {
    public static void main(String[] args){
        //Declare the constants
        final double PI=3.14159;
        //calculate the volume of the cylinder
        Scanner scanner=new Scanner(System.in);
        //print the prompt
        System.out.print("Enter radius of cone:");
        double radius=scanner.nextDouble();
        System.out.print("Enter the height of the cone:");
        double height=scanner.nextDouble();

       if((radius<=0) || (height<=0)){
           System.out.println("Please make sure the number is greater than zero");
       }
       else{
           //process everything
           double volume=(PI*radius*radius*height)/3;
           //Display the output to the user
           System.out.println("The volume of the cone of height: "+height+"and radius " +radius +"is:" +volume);
       }
    }

}
