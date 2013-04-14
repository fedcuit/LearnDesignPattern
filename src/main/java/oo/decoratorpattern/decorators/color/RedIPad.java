package oo.decoratorpattern.decorators.color;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class RedIPad extends CustomizeDecorator {
    public RedIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 400;
    }
}
