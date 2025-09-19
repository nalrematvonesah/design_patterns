package org.example.abstract_factory_method_pattern.factories;

import org.example.abstract_factory_method_pattern.students.LawStudent;
import org.example.abstract_factory_method_pattern.students.CsStudent;

public interface University {
    LawStudent createLawStudent();
    CsStudent createCsStudent();
}
