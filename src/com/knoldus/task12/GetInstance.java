package com.knoldus.task12;

import java.util.Scanner;

public class GetInstance
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        InstanceVariable instanceOne = new InstanceVariable();
        String name;
        System.out.println("Enter the name");
        name = input.nextLine();
        instanceOne.setName(name);
        System.out.println("The name is"+instanceOne.getName());
    }
}