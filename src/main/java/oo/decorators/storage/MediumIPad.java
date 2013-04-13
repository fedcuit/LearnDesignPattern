package oo.decorators.storage;

import oo.decorators.CustomizeDecorator;
import oo.decorators.color.WhiteIPad;
import oo.ipad.IPad;

public class MediumIPad extends CustomizeDecorator {

    public MediumIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return iPad.getPrice() + 2500;
    }
}
