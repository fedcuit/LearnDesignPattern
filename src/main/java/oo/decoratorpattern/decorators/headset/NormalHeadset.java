package oo.decoratorpattern.decorators.headset;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class NormalHeadset extends CustomizeDecorator {
    public NormalHeadset(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 160;
    }
}
