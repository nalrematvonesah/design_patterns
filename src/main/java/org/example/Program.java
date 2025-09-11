package org.example;


public class Program {
    public static void main(String[] args) {
        EmployeeDirector director = new EmployeeDirector();
        Employee salesMan = director.createCustomEmployee("Kolya", 20, "Sales");
        Employee dev = director.createCustomEmployee("Sanya", 19, "IT");
        System.out.println(salesMan);
        System.out.println(dev);
    }
}
