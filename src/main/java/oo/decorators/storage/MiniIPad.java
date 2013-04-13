package oo.decorators.storage;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class MiniIPad extends CustomizeDecorator {
    public MiniIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 800;
    }
}
