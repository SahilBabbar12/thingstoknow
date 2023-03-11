package com.knoldus.task6;

import java.util.Scanner;

public class TemperatureConverter
{
    static int conversion_factor;
    public double celsiusToFahrenheit(double temperature_celsius)
    {
        double temperature_fahrenheit = (temperature_celsius * conversion_factor) + 32;
        return temperature_fahrenheit;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TemperatureConverter temperature = new TemperatureConverter();
        double celsius;
        System.out.println("Enter the value of temperature in celsius");
        celsius = input.nextDouble();
        double temperature_fahrenheit = temperature.celsiusToFahrenheit(celsius);
        System.out.println("temperature in fahrenheit: "+temperature_fahrenheit);
    }
}