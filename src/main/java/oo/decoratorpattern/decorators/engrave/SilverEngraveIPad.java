package oo.decoratorpattern.decorators.engrave;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class SilverEngraveIPad extends CustomizeDecorator {
    public SilverEngraveIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 300;
    }
}
