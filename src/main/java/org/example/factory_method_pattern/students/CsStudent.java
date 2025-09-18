package org.example.factory_method_pattern.students;

public class CsStudent implements Student {
    @Override
    public void say() {
        System.out.println("I'm a CS student");
    }
    @Override
    public void learn() {
        System.out.println("I learn to code");
    }
    @Override
    public void write() {
        System.out.println("I write");
    }
}
