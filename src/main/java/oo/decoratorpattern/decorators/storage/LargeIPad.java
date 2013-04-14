package oo.decoratorpattern.decorators.storage;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class LargeIPad extends CustomizeDecorator {
    public LargeIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 3200;
    }
}
