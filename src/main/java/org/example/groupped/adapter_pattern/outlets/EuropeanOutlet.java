package org.example.groupped.adapter_pattern.outlets;

import org.example.groupped.adapter_pattern.plugs.EuropeanPlug;

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
            return true;
        }
        else {
            System.out.println("Plug does not fit");
            return false;
        }
    }
}
