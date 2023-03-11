package com.knoldus.task2;

import java.util.Scanner;

public class Circle {
    private static final double PI=3.14;
    int radius;
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius=input.nextInt();

        double circumference =2 *Circle.PI *radius;
        System.out.println("circumference: "+circumference);
    }
}
