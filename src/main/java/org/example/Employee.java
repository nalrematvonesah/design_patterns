package org.example;

// Assignment 1
// 1. Product
public class Employee {
    private String name;
    private int age;
    private String department;

    private Employee() {}

    // 2. Builder
    public static class Builder {
        private String name;
        private int age;
        private String department;
        // 3. Concrete Builders
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setAge(int age) { this.age = age; return this; }
        public Builder setDepartment(String department) { this.department = department; return this; }

        public Employee build() {
            Employee e = new Employee();
            e.name = name;
            e.age = age;
            e.department = department;
            return e;
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

// 4. Директор (Director)

class EmployeeDirector  {
    public Employee createCustomEmployee(String name, int age, String department) {
        return new Employee.Builder()
                .setName(name)
                .setAge(age)
                .setDepartment(department)
                .build();
    }

    public Employee createDevEmployee(String name, int age) {
        return new Employee.Builder()
                .setName(name)
                .setAge(age)
                .setDepartment("IT")
                .build();
    }
    public Employee createSalesEmployee(String name, int age) {
        return new Employee.Builder()
                .setName(name)
                .setAge(age)
                .setDepartment("Sales")
                .build();
    }
}


