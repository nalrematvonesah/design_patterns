package org.example;


// 1. Product
public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public String print() {
        String info = "";
        info += "Name: " + name + "\n";
        info += "Age: " + age + "\n";
        info += "Department: " + department + "\n";
        return info;
    }
}

