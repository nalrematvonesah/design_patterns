package org.example.visitor_pattern.pc_parts;

import org.example.visitor_pattern.visitor.Visitor;

public class Mouse extends PcPart {

    public Mouse(String brand, String name, double price) {
        super(brand, name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
