package oo.decoratorpattern.decorators.module;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class ThreeGPlusWifiIPad extends CustomizeDecorator {
    public ThreeGPlusWifiIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 3200;
    }
}
