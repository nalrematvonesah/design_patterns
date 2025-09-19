package org.example.abstract_factory_method_pattern.factories;

import org.example.abstract_factory_method_pattern.students.EnuCsStudent;
import org.example.abstract_factory_method_pattern.students.EnuLawStudent;
import org.example.abstract_factory_method_pattern.students.CsStudent;
import org.example.abstract_factory_method_pattern.students.LawStudent;

public class EnuUniversity implements University {
    @Override
    public CsStudent createCsStudent() {
        return new EnuCsStudent();
    }
    @Override
    public LawStudent createLawStudent() {
        return new EnuLawStudent();
    }
}
