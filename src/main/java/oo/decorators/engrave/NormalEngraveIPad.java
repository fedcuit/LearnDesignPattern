package oo.decorators.engrave;

import oo.decorators.CustomizeDecorator;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;
import sun.java2d.loops.CustomComponent;

import java.beans.Customizer;

public class NormalEngraveIPad extends CustomizeDecorator {
    public NormalEngraveIPad(IPad iPad) {
        this.iPad = iPad;
    }

    @Override
    public int getPrice() {
        return this.iPad.getPrice() + 100;
    }
}
