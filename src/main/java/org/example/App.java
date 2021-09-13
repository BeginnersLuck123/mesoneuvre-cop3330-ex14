package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double order = input.nextDouble();//Input
        input.nextLine();
        System.out.println("What is the state?");
        String state = input.nextLine();//Input
       double tax = .55;
        double total;
        //Determining what to output based on state
        if(state.equals("WI"))
        {
             total = (order + tax);
             System.out.println("The subtotal is $" + order + "." + "\n" + "The tax is $" + tax + "." + "\n" + "The total is $" + total + "."); //Output for IF statement
        }
        if(state.equals("MN"))
        {
            total = order;
            System.out.println("The total is $" + total + ".");//Output for IF statement
        }
    }
}
