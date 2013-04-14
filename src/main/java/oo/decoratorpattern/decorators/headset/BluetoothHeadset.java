package oo.decoratorpattern.decorators.headset;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class BluetoothHeadset extends CustomizeDecorator {
    public BluetoothHeadset(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 200;
    }
}
