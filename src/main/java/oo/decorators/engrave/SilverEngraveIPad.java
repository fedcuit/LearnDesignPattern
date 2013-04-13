package oo.decorators.engrave;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class SilverEngraveIPad extends CustomizeDecorator {
    public SilverEngraveIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 300;
    }
}
