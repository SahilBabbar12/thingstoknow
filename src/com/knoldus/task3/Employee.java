package com.knoldus.task3;

public class Employee {
    private static int nextid =1;
    int employee_id;
    Employee(){
        this .employee_id=nextid;   // assigning unique id to each employee and increment the nextid by 1
        nextid++;
    }

    public static void main(String[] args) {
        Employee employee1 =new Employee();
        Employee employee2=new Employee();

        System.out.println("employee1 id: "+employee1.employee_id);
        System.out.println("employee2 id: "+employee2.employee_id);
    }
}
