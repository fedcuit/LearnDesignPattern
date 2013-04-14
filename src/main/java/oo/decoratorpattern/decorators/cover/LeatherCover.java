package oo.decoratorpattern.decorators.cover;

import oo.decoratorpattern.decorators.CustomizeDecorator;
import oo.decoratorpattern.ipad.IPad;

public class LeatherCover extends CustomizeDecorator {
    public LeatherCover(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 320;
    }
}
