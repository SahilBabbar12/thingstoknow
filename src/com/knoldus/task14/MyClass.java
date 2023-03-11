package com.knoldus.task14;

public class MyClass
{
    public void showInteger()
    {
        //access public method of PublicMethod class
        PublicMethod publicOne = new PublicMethod();
        System.out.println(publicOne.getInteger());
    }
}