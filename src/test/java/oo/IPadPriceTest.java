package oo;

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
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadPriceTest {
    @Test
    public void testShouldGetCorrectPriceForBlackIPad() {
        IPad iPad = new ConcreteIPad();
        assertThat(iPad.getPrice(), is(3688));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteIPad() {
        IPad iPad = new WhiteIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 200));
    }

    @Test
    public void testShouldGetCorrectPriceForNormalEngraveIPad() {
        IPad iPad = new NormalEngraveIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 100));
    }

    @Test
    public void testShouldGetCorrectPriceForSilverEngraveIPad() {
        IPad iPad = new SilverEngraveIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 300));
    }

    @Test
    public void testShouldGetCorrectPriceForGoldenEngraveIPad() {
        IPad iPad = new GoldenEngraveIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 400));
    }

    @Test
    public void testShouldGetCorrectPriceForRedIPad() {
        IPad iPad = new RedIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 400));
    }

    @Test
    public void testShouldGetCorrectPriceForWifiIPad() {
        IPad iPad = new WifiIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 800));
    }

    @Test
    public void testShouldGetCorrectPriceForThreeGIPad() {
        IPad iPad = new ThreeGIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 1600));
    }

    @Test
    public void testShouldGetCorrectPriceForThreeGPlusWifiIPad() {
        IPad iPad = new ThreeGPlusWifiIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 3200));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadMini() {
        IPad iPad = new MiniIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 800));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadSmall() {
        IPad iPad = new SmallIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 1600));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadMedium() {
        IPad iPad = new MediumIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 2500));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadLarge() {
        IPad iPad = new LargeIPad(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 3200));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithLeatherCover() {
        IPad iPad = new LeatherCover(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 320));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithNormalHeadset() {
        IPad iPad = new NormalHeadset(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 160));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithBluetooth() {
        IPad iPad = new BluetoothHeadset(new ConcreteIPad());
        assertThat(iPad.getPrice(), is(3688 + 200));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteIPadMedium() {
        IPad iPad = new MediumIPad(new WhiteIPad(new ConcreteIPad()));
        assertThat(iPad.getPrice(), is(3688 + 200 + 2500));
    }
    
    @Test
    public void testShouldGetCorrectPriceForRedIPad3GSmall() {
        IPad iPad = new RedIPad(new ThreeGIPad(new SmallIPad(new ConcreteIPad())));
        assertThat(iPad.getPrice(), is(3688 + 400 + 1600 + 1600));
    }


    @Test
    public void testShouldGetCorrectPriceForMediumThreeGPlusWifiGoldenEngraveIPad() {
        IPad iPad = new WhiteIPad(new MiniIPad(new ThreeGPlusWifiIPad(new GoldenEngraveIPad(new ConcreteIPad()))));
        assertThat(iPad.getPrice(), is(3688 + 200 + 800 + 3200 + 400));
    }

    @Test
    public void testShouldGetCorrectPriceForRedLargeWifiNormalEngraveIPadWithNormalHeadset() {
        IPad iPad = new RedIPad(new LargeIPad(new WifiIPad(new NormalEngraveIPad(new NormalHeadset(new ConcreteIPad())))));
        assertThat(iPad.getPrice(), is(3688 + 400 + 3200 + 800 + 100 + 160));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteLargeThreeGPlusWifiSilverEngraveIPadWithBluetoothAndLeatherCover() {
        IPad iPad = new WhiteIPad(new SmallIPad(new ThreeGPlusWifiIPad(new SilverEngraveIPad(new BluetoothHeadset(new LeatherCover(new ConcreteIPad()))))));
        assertThat(iPad.getPrice(), is(3688 + 200 + 1600 + 3200 + 200 + 300 + 320));
    }

}
