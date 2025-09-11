package org.example;


public class Program {
    public static void main(String[] args) {
        Director director = new Director();
        EmployeeBuilder builder = new EmployeeBuilder();
        director.constructEmployee(builder);
        Employee employee = builder.getResult();
        System.out.println(employee.print());
    }
}
