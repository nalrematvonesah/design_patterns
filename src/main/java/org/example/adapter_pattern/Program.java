package org.example.adapter_pattern;

import org.example.adapter_pattern.adapters.UsPlugAdapter;
import org.example.adapter_pattern.outlets.EuropeanOutlet;
import org.example.adapter_pattern.plugs.EuropeanPlug;
import org.example.adapter_pattern.plugs.UsPlug;

public class Program {
    public static void main(String[] args) {
        EuropeanOutlet outlet = new EuropeanOutlet(true);
        EuropeanPlug plug1 = new EuropeanPlug(true);
        UsPlug plug2 = new UsPlug(true);
        UsPlugAdapter usAdapter = new UsPlugAdapter(plug2);
        outlet.fits(plug1);
        outlet.fits(usAdapter);
    }
}
