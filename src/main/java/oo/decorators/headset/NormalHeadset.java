package oo.decorators.headset;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class NormalHeadset extends CustomizeDecorator {
    public NormalHeadset(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 160;
    }
}
