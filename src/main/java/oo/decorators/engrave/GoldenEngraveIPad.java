package oo.decorators.engrave;

import oo.decorators.CustomizeDecorator;
import oo.ipad.IPad;

public class GoldenEngraveIPad extends CustomizeDecorator {
    public GoldenEngraveIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 400;
    }
}
