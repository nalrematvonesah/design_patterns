package org.example.visitor_pattern.pc_parts;

import org.example.visitor_pattern.visitor.Visitor;

public abstract class PcPart {
    String brand;
    String model;
    double price;

    public PcPart(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void accept(Visitor visitor);
}
