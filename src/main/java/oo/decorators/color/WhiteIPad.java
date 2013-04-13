package oo.decorators.color;

import oo.decorators.CustomizeDecorator;
import oo.ipad.IPad;

public class WhiteIPad extends CustomizeDecorator {

    public WhiteIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 200;
    }
}
