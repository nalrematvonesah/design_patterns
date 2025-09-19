package org.example.abstract_factory_method_pattern;

import org.example.abstract_factory_method_pattern.factories.EnuUniversity;
import org.example.abstract_factory_method_pattern.students.*;
import org.example.abstract_factory_method_pattern.factories.University;
import org.example.abstract_factory_method_pattern.factories.AituUniversity;

public class Program {
    public static void main(String[] args) {
        University aitu = new AituUniversity();
        University enu = new EnuUniversity();

        CsStudent csStudentAitu = new AituCsStudent();
        CsStudent csStudentEnu = new EnuCsStudent();
        LawStudent lawStudentAitu = new AituLawStudent();
        LawStudent lawStudentEnu = new EnuLawStudent();

        csStudentEnu.code();
        csStudentAitu.code();
        lawStudentAitu.performLaw();
        lawStudentEnu.performLaw();
    }
}