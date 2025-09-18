package org.example.factory_method_pattern.factories;
import org.example.factory_method_pattern.students.CsStudent;
import org.example.factory_method_pattern.students.Student;

public class CsStudentFactory implements Factory {
    @Override
    public Student factoryMethod() {
        return new CsStudent();
    }
}
