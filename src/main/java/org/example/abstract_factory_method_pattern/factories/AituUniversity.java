package org.example.abstract_factory_method_pattern.factories;

import org.example.abstract_factory_method_pattern.students.AituCsStudent;
import org.example.abstract_factory_method_pattern.students.AituLawStudent;
import org.example.abstract_factory_method_pattern.students.CsStudent;
import org.example.abstract_factory_method_pattern.students.LawStudent;

public class AituUniversity implements University {
    @Override
    public CsStudent createCsStudent() {
        return new AituCsStudent();
    }
    @Override
    public LawStudent createLawStudent() {
        return new AituLawStudent();
    }
}
