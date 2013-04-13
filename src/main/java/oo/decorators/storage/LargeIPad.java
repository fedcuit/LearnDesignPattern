package oo.decorators.storage;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class LargeIPad extends CustomizeDecorator {
    public LargeIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 3200;
    }
}
