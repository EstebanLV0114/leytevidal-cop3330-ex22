package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int One, Two, Three;

        System.out.print("Enter the first number: ");
        One = Integer.parseInt(input.nextLine());

        System.out.print("Enter the second number: ");
        Two = Integer.parseInt(input.nextLine());

        System.out.print("Enter the third number: ");
        Three = Integer.parseInt(input.nextLine());

        if(One > Two)
        {
            if(One > Three)
            {
                System.out.printf("Largest number is first: %d",One);
            }
            else
            {
                System.out.printf("Largest number is third: %d",Three);
            }
        }
        else if(Two > Three)
        {
            System.out.printf("largest number is second: %d",Two);
        }
        else
        {
            System.out.printf("Largest number is third: %d",Three);
        }

    }
}

