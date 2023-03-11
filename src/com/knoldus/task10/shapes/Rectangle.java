package com.knoldus.task10.shapes;

class Rectangle
{
    public double calculateArea(int length, int breadth)
    {
        return length*breadth;
    }
    public double calculatePerimeter(int length, int breadth)
    {
        return 2*(length+breadth);
    }
}