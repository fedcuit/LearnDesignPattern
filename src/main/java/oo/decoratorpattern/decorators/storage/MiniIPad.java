package oo.decoratorpattern.decorators.storage;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class MiniIPad extends CustomizeDecorator {
    public MiniIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 800;
    }
}
