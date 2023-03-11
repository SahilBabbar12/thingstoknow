package com.knoldus.task1;

public class Car {
    private static int numOfCars = 0;  // Static variable to keep track of the number of cars

    public Car() {
        numOfCars++;
    }
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("Number of Cars: "+Car.numOfCars);
    }
}