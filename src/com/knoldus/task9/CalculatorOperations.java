package com.knoldus.task9;


import java.util.Scanner;

class Calculator
{
    public static int add(int number1, int number2)
    {
        int sum = number1+number2;
        return sum;
    }
    public static int subtract(int number1, int number2)
    {
        int difference = number1-number2;
        return difference;
    }
    public static int multiply(int number1, int number2)
    {
        int product = number1*number2;
        return product;
    }
    public static int divide(int number1, int number2)
    {
        int quotient = number1/number2;
        return quotient;
    }
}
public class CalculatorOperations {
    public static void main(String args[])
    {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number 1: ");
        number1 = input.nextInt();
        System.out.println("Enter the value of number 2: ");
        number2 = input.nextInt();

        //calling methods to perform different  operations..
        System.out.println("The answer of addition is: "+Calculator.add(number1, number2));
        System.out.println("The answer of subtraction is: "+Calculator.subtract(number1, number2));
        System.out.println("The answer of multiplication is: "+Calculator.multiply(number1, number2));
        System.out.println("The answer of division is: "+Calculator.divide(number1, number2));
    }
}