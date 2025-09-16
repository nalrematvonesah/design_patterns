package org.example.builder_pattern;

public class EmployeeBuilder extends Builder {
    private String name;
    private int age;
    private String department;

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
    public Employee getResult() {
        return new Employee(name, age, department);
    }
}