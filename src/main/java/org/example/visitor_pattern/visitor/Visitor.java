package org.example.visitor_pattern.visitor;


import org.example.visitor_pattern.pc_parts.Keyboard;
import org.example.visitor_pattern.pc_parts.Monitor;
import org.example.visitor_pattern.pc_parts.Mouse;

public interface Visitor {
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
