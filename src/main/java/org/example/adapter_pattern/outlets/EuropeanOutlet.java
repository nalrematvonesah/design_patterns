package org.example.adapter_pattern.outlets;

import org.example.adapter_pattern.plugs.EuropeanPlug;

public class EuropeanOutlet {
    private boolean european;

    public EuropeanOutlet(boolean european) {
        this.european = european;
    }
    public boolean getEuropean() {
        return european;
    }
    public boolean fits(EuropeanPlug plug) {
        if (plug.getEuropean() == true) {
            System.out.println("Plug fits");
        }
        return true;
    }
}
