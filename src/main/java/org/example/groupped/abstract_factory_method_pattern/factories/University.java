package org.example.groupped.abstract_factory_method_pattern.factories;

import org.example.groupped.abstract_factory_method_pattern.students.CsStudent;
import org.example.groupped.abstract_factory_method_pattern.students.LawStudent;

public interface University {
    LawStudent createLawStudent();
    CsStudent createCsStudent();
}
