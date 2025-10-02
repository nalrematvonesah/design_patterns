package org.example.groupped.factory_method_pattern.factories;
import org.example.groupped.factory_method_pattern.students.LawStudent;
import org.example.groupped.factory_method_pattern.students.Student;

public class LawStudentFactory implements StudentFactory {
    @Override
    public Student factoryMethod() {
        return new LawStudent();
    }
}
