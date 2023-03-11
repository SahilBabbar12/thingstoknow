package com.knoldus.task15.GetInstanceAccess;

import com.knoldus.task15.Default.DefaultInstanceVariable;

public class GetDefaultInstance
{
    public static void main(String args[])
    {
        DefaultInstanceVariable defaultInstance = new DefaultInstanceVariable();

        //cant access the default instance variable from a different package
        System.out.println(defaultInstance.number);
    }
}