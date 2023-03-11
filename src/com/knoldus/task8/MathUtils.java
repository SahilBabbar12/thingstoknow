package com.knoldus.task8;

import java.util.Scanner;

public class MathUtils
{
    public static double E = 2.71828;

    public static double calculate(double x) {
        double result = Math.pow(x, E);
        return result;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double number = input.nextDouble();
        double exponential = MathUtils.calculate(number);
        System.out.println("The exponential of " + number+ " is " + exponential);

    }
}