package org.example.visitor_pattern.pc_parts;

import org.example.visitor_pattern.visitor.Visitor;

public class Keyboard extends PcPart {

    public Keyboard(String brand, String name, double price) {
        super(brand, name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
