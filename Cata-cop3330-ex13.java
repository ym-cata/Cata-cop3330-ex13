/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

      
        System.out.print("What is the principal amount? "); //asks user to input principal
        int principalAmount = input.nextInt();

     
        System.out.print("What is the rate? "); //asks user to input rate
        double rate = input.nextDouble();


        System.out.print("What is the number of years? "); //asks user to input years
        int year = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? "); //asks user to input number of times compounded per year
        int n = input.nextInt();

     
        double A = principalAmount*Math.pow(1+((rate*0.01)/n),n*year); //calculates compound interest using formula 
        
        
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", //prints investment 
                   principalAmount, rate, year, n, A);

        input.close();
    }
}