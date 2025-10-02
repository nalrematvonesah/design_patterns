package org.example.factory_method_pattern;
import org.example.factory_method_pattern.factories.CsStudentFactory;
import org.example.factory_method_pattern.factories.StudentFactory;
import org.example.factory_method_pattern.factories.LawStudentFactory;
import org.example.factory_method_pattern.students.Student;

public class Program {
    public static void main(String[] args) {
        StudentFactory csStudentFactory = new CsStudentFactory();
        Student csStudent = csStudentFactory.factoryMethod();
        csStudent.learn();

        StudentFactory lawStudentFactory = new LawStudentFactory();
        Student lawStudent = lawStudentFactory.factoryMethod();
        lawStudent.say();
    }
}
