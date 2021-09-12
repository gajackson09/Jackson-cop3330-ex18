/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
import java.util.Scanner;
public class ex18{
    public static void main(String arg[]){
    Scanner input = new Scanner(System.in);    
    //declaring variables        
    double F,C;
                    
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
            int tempconverter=input.nextInt();
        
        switch(tempconverter){
            case 1: System.out.println("Enter  Fahrenheit temperature ");
                        F = input.nextDouble();

                  C=(F-32)*5/9;
                  System.out.println("Celsius temperature is = "+C);
                  break;
            case 2: System.out.println("Enter  Celsius temperature ");
                        C = input.nextDouble();
                  
                  F=((9*C)/5)+32;
                  System.out.println("Fahrenheit temperature is = "+F);
                  break;
                  
           default:  System.out.println("Please choose valid choice");
           }//end of switch  
        }//end of main 
}//end of class