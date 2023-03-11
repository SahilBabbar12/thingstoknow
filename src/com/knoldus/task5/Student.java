package com.knoldus.task5;

public class Student {
    private static int numOfStudents;

    public Student() {
        numOfStudents++;
    }

    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();

        System.out.println("Total num of students: "+Student.numOfStudents);
    }
}
