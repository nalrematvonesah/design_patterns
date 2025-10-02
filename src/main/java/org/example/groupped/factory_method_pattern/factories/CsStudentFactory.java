package org.example.groupped.factory_method_pattern.factories;
import org.example.groupped.factory_method_pattern.students.CsStudent;
import org.example.groupped.factory_method_pattern.students.Student;

public class CsStudentFactory implements StudentFactory {
    @Override
    public Student factoryMethod() {
        return new CsStudent();
    }
}
