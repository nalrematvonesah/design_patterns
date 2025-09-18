package org.example.factory_method_pattern.factories;
import org.example.factory_method_pattern.students.LawStudent;
import org.example.factory_method_pattern.students.Student;

public class LawStudentFactory implements Factory {
    @Override
    public Student factoryMethod() {
        return new LawStudent();
    }
}
