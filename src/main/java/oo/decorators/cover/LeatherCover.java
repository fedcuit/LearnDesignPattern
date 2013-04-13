package oo.decorators.cover;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class LeatherCover extends CustomizeDecorator {
    public LeatherCover(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 320;
    }
}
