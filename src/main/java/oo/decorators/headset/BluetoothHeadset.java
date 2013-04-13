package oo.decorators.headset;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class BluetoothHeadset extends CustomizeDecorator {
    public BluetoothHeadset(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 200;
    }
}
