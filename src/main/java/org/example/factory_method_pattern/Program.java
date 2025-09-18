package org.example.factory_method_pattern;
import org.example.factory_method_pattern.factories.CsStudentFactory;
import org.example.factory_method_pattern.factories.Factory;
import org.example.factory_method_pattern.factories.LawStudentFactory;
import org.example.factory_method_pattern.students.Student;

public class Program {
    public static void main(String[] args) {
        Factory csFactory = new CsStudentFactory();
        Student csStudent = csFactory.factoryMethod();
        csStudent.learn();

        Factory lawFactory = new LawStudentFactory();
        Student lawStudent = lawFactory.factoryMethod();
        lawStudent.say();
    }
}
