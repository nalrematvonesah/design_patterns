package org.example.visitor_pattern;

import org.example.visitor_pattern.pc_parts.Keyboard;
import org.example.visitor_pattern.pc_parts.Monitor;
import org.example.visitor_pattern.pc_parts.Mouse;
import org.example.visitor_pattern.visitor.PcPriceVisitor;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Razor", "Qwertyu", 100);
        Mouse mouse = new Mouse("QAz", "Qwertyu", 200);
        Monitor monitor = new Monitor("Qaz", "Qwertyu", 300);

        PcPriceVisitor pcPriceVisitor = new PcPriceVisitor();
        pcPriceVisitor.visit(keyboard);
        pcPriceVisitor.visit(monitor);
        pcPriceVisitor.visit(mouse);
        pcPriceVisitor.getTotalPrice();
    }
}
