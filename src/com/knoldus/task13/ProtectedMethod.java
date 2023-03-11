package com.knoldus.task13;

public class ProtectedMethod
{
    protected int returnInteger()
    {
        return 20;
    }
}
class GetProtectedMethod extends ProtectedMethod
{
    public int getInteger()
    {
        //call the protected method of parent class from sub class
        int number = returnInteger();
        return number;
    }
    public static void main(String args[])
    {
        GetProtectedMethod getmethod = new GetProtectedMethod();
        System.out.println("Integer: "+getmethod.getInteger());
    }
}
