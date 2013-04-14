package oo.decoratorpattern;


import oo.decoratorpattern.builder.IPadBuilder;
import oo.decoratorpattern.ipad.IPad;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadPriceTest {
    @Test
    public void testShouldGetCorrectPriceForBlackIPad() {
        IPad iPad = new IPadBuilder().build();
        assertThat(iPad.getPrice(), is(3688));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteIPad() {
        IPad iPad = new IPadBuilder().white().build();
        assertThat(iPad.getPrice(), is(3688 + 200));
    }

    @Test
    public void testShouldGetCorrectPriceForRedIPad() {
        IPad iPad = new IPadBuilder().red().build();
        assertThat(iPad.getPrice(), is(3688 + 400));
    }

    @Test
    public void testShouldGetCorrectPriceForNormalEngraveIPad() {
        IPad iPad = new IPadBuilder().normalEngrave().build();
        assertThat(iPad.getPrice(), is(3688 + 100));
    }

    @Test
    public void testShouldGetCorrectPriceForSilverEngraveIPad() {
        IPad iPad = new IPadBuilder().silverEngrave().build();
        assertThat(iPad.getPrice(), is(3688 + 300));
    }

    @Test
    public void testShouldGetCorrectPriceForGoldenEngraveIPad() {
        IPad iPad = new IPadBuilder().goldenEngrave().build();
        assertThat(iPad.getPrice(), is(3688 + 400));
    }


    @Test
    public void testShouldGetCorrectPriceForWifiIPad() {
        IPad iPad = new IPadBuilder().wifi().build();
        assertThat(iPad.getPrice(), is(3688 + 800));
    }

    @Test
    public void testShouldGetCorrectPriceForThreeGIPad() {
        IPad iPad = new IPadBuilder().threeGIPad().build();
        assertThat(iPad.getPrice(), is(3688 + 1600));
    }

    @Test
    public void testShouldGetCorrectPriceForThreeGPlusWifiIPad() {
        IPad iPad = new IPadBuilder().threeGPlusWifi().build();
        assertThat(iPad.getPrice(), is(3688 + 3200));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadMini() {
        IPad iPad = new IPadBuilder().mini().build();
        assertThat(iPad.getPrice(), is(3688 + 800));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadSmall() {
        IPad iPad = new IPadBuilder().small().build();
        assertThat(iPad.getPrice(), is(3688 + 1600));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadMedium() {
        IPad iPad = new IPadBuilder().medium().build();
        assertThat(iPad.getPrice(), is(3688 + 2500));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadLarge() {
        IPad iPad = new IPadBuilder().large().build();
        assertThat(iPad.getPrice(), is(3688 + 3200));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithLeatherCover() {
        IPad iPad = new IPadBuilder().leatherCover().build();
        assertThat(iPad.getPrice(), is(3688 + 320));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithNormalHeadset() {
        IPad iPad = new IPadBuilder().normalHeadset().build();
        assertThat(iPad.getPrice(), is(3688 + 160));
    }

    @Test
    public void testShouldGetCorrectPriceForIPadWithBluetooth() {
        IPad iPad = new IPadBuilder().blueToothHeadset().build();
        assertThat(iPad.getPrice(), is(3688 + 200));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteIPadMedium() {
        IPad iPad = new IPadBuilder().white().medium().build();
        assertThat(iPad.getPrice(), is(3688 + 200 + 2500));
    }

    @Test
    public void testShouldGetCorrectPriceForRedIPad3GSmall() {
        IPad iPad = new IPadBuilder().red().threeGIPad().small().build();
        assertThat(iPad.getPrice(), is(3688 + 400 + 1600 + 1600));
    }


    @Test
    public void testShouldGetCorrectPriceForWhiteMiniThreeGPlusWifiGoldenEngraveIPad() {
        IPad iPad = new IPadBuilder().white().mini().threeGPlusWifi().goldenEngrave().build();
        assertThat(iPad.getPrice(), is(3688 + 200 + 800 + 3200 + 400));
    }

    @Test
    public void testShouldGetCorrectPriceForRedLargeWifiNormalEngraveIPadWithNormalHeadset() {
        IPad iPad = new IPadBuilder().red().large().wifi().normalEngrave().normalHeadset().build();
        assertThat(iPad.getPrice(), is(3688 + 400 + 3200 + 800 + 100 + 160));
    }

    @Test
    public void testShouldGetCorrectPriceForWhiteLargeThreeGPlusWifiSilverEngraveIPadWithBluetoothAndLeatherCover() {
        IPad iPad = new IPadBuilder().white().small().threeGPlusWifi().silverEngrave().blueToothHeadset().leatherCover().build();
        assertThat(iPad.getPrice(), is(3688 + 200 + 1600 + 3200 + 200 + 300 + 320));
    }

}
