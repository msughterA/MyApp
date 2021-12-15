package com.company;

import java.util.Scanner;

//Reading input from the user
public class Test {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name:");
        String name=scanner.nextLine().trim();
        System.out.println("you are "+name);
    }
}
