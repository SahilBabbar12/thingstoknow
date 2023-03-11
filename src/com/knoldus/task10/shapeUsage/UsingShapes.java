package com.knoldus.task10.shapeUsage;

import com.knoldus.task10.shapes.Circle;

import java.util.Scanner;

public class UsingShapes
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius of the circle: ");
        radius = takeInput.nextInt();
        Circle circle1 = new Circle();

        //area of circle
        System.out.println("The area of cicle is: "+circle1.calculateArea(radius));
    }
}