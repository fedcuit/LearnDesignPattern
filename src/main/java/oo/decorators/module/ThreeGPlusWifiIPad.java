package oo.decorators.module;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class ThreeGPlusWifiIPad extends CustomizeDecorator {
    public ThreeGPlusWifiIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 3200;
    }
}
