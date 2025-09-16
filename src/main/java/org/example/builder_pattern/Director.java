package org.example.builder_pattern;

public class Director {
    public void constructEmployee(Builder builder) {
        builder.setName("John Doe");
        builder.setAge(12);
        builder.setDepartment("Engineering");
        builder.build();
    }
}
