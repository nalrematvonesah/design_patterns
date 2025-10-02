package org.example.groupped;

import org.example.groupped.abstract_factory_method_pattern.factories.AituUniversity;
import org.example.groupped.abstract_factory_method_pattern.factories.EnuUniversity;
import org.example.groupped.abstract_factory_method_pattern.factories.University;
import org.example.groupped.abstract_factory_method_pattern.students.*;
import org.example.groupped.adapter_pattern.adapters.UsPlugAdapter;
import org.example.groupped.adapter_pattern.outlets.EuropeanOutlet;
import org.example.groupped.adapter_pattern.plugs.EuropeanPlug;
import org.example.groupped.adapter_pattern.plugs.UsPlug;
import org.example.groupped.factory_method_pattern.factories.CsStudentFactory;
import org.example.groupped.factory_method_pattern.factories.LawStudentFactory;
import org.example.groupped.factory_method_pattern.factories.StudentFactory;
import org.example.groupped.factory_method_pattern.students.Student;

public class Program {
    public static void main(String[] args) {
        // Abstract Factory
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

        // Factory
        StudentFactory csStudentFactory = new CsStudentFactory();
        Student csStudent = csStudentFactory.factoryMethod();
        csStudent.learn();

        StudentFactory lawStudentFactory = new LawStudentFactory();
        Student lawStudent = lawStudentFactory.factoryMethod();
        lawStudent.say();

        // Adapter
        EuropeanOutlet outlet = new EuropeanOutlet(true);
        EuropeanPlug plug1 = new EuropeanPlug(true);
        UsPlug plug2 = new UsPlug(true);
        UsPlugAdapter usAdapter = new UsPlugAdapter(plug2);
        outlet.fits(plug1);
        outlet.fits(usAdapter);
    }
}