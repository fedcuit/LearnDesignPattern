package oo.decoratorpattern.decorators.storage;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class MediumIPad extends CustomizeDecorator {

    public MediumIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return iPad.getPrice() + 2500;
    }
}
