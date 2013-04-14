package oo.builder;

import oo.decorators.color.RedIPad;
import oo.decorators.color.WhiteIPad;
import oo.decorators.cover.LeatherCover;
import oo.decorators.engrave.GoldenEngraveIPad;
import oo.decorators.engrave.NormalEngraveIPad;
import oo.decorators.engrave.SilverEngraveIPad;
import oo.decorators.headset.BluetoothHeadset;
import oo.decorators.headset.NormalHeadset;
import oo.decorators.module.ThreeGIPad;
import oo.decorators.module.ThreeGPlusWifiIPad;
import oo.decorators.module.WifiIPad;
import oo.decorators.storage.LargeIPad;
import oo.decorators.storage.MediumIPad;
import oo.decorators.storage.MiniIPad;
import oo.decorators.storage.SmallIPad;
import oo.ipad.ConcreteIPad;
import oo.ipad.IPad;

public class IPadBuilder {
    private IPad iPad;
    public IPadBuilder() {
        this.iPad = new ConcreteIPad();
    }

    public IPad build() {
        return this.iPad;
    }

    public IPadBuilder white() {
        this.iPad = new WhiteIPad(this.iPad);
        return this;
    }

    public IPadBuilder red() {
        this.iPad = new RedIPad(this.iPad);
        return this;
    }

    public IPadBuilder normalEngrave() {
        this.iPad = new NormalEngraveIPad(this.iPad);
        return this;
    }

    public IPadBuilder silverEngrave() {
        this.iPad = new SilverEngraveIPad(this.iPad);
        return this;
    }

    public IPadBuilder goldenEngrave() {
        this.iPad = new GoldenEngraveIPad(this.iPad);
        return this;
    }

    public IPadBuilder wifi() {
        this.iPad = new WifiIPad(this.iPad);
        return this;
    }

    public IPadBuilder threeGIPad() {
        this.iPad = new ThreeGIPad(this.iPad);
        return this;
    }

    public IPadBuilder threeGPlusWifi() {
        this.iPad = new ThreeGPlusWifiIPad(this.iPad);
        return this;
    }

    public IPadBuilder mini() {
        this.iPad = new MiniIPad(this.iPad);
        return this;
    }

    public IPadBuilder small() {
        this.iPad = new SmallIPad(this.iPad);
        return this;
    }

    public IPadBuilder medium() {
        this.iPad = new MediumIPad(this.iPad);
        return this;
    }

    public IPadBuilder large() {
        this.iPad = new LargeIPad(this.iPad);
        return this;
    }

    public IPadBuilder leatherCover() {
        this.iPad = new LeatherCover(this.iPad);
        return this;
    }

    public IPadBuilder normalHeadset() {
        this.iPad = new NormalHeadset(this.iPad);
        return this;
    }

    public IPadBuilder blueToothHeadset() {
        this.iPad = new BluetoothHeadset(this.iPad);
        return this;
    }
}
