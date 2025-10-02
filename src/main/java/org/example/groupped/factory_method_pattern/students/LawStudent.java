package org.example.groupped.factory_method_pattern.students;

public class LawStudent implements Student {
    @Override
    public void say() {
        System.out.println("I'm a Law Student");
    }
    @Override
    public void learn() {
        System.out.println("I learn constitutional law");
    }
    @Override
    public void write() {
        System.out.println("I write homework about law");
    }
}