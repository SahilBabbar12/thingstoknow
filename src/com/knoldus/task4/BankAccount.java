package com.knoldus.task4;

import java.util.Scanner;

public class BankAccount {
    private static double interestRate=2.5;
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Balance");
        double balance =input.nextDouble();

        double interest_earned=balance * (BankAccount.interestRate)/100;

        System.out.println("Interest earned: "+interest_earned);
    }
}
