package org.example.adapter_pattern.adapters;

import org.example.adapter_pattern.plugs.EuropeanPlug;
import org.example.adapter_pattern.plugs.UsPlug;

public class UsPlugAdapter extends EuropeanPlug {
    private UsPlug usplug;

    public UsPlugAdapter(UsPlug usplug) {
        this.usplug = usplug;
    }

    @Override
    public boolean getEuropean() {
        System.out.println("Adapter was connected");
        return true;
    }
}
