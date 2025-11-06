package org.example.visitor_pattern.visitor;

import org.example.visitor_pattern.pc_parts.Keyboard;
import org.example.visitor_pattern.pc_parts.Monitor;
import org.example.visitor_pattern.pc_parts.Mouse;

public class PcPriceVisitor implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visit(Mouse mouse) {
        totalPrice += mouse.getPrice();
    }

    @Override
    public void visit(Keyboard keyboard) {
        totalPrice += keyboard.getPrice();
    }

    @Override
    public void visit(Monitor monitor) {
        totalPrice += monitor.getPrice();
    }

    public void getTotalPrice() {
        System.out.println(totalPrice);
    }
}
