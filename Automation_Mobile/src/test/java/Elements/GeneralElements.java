package Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class GeneralElements {
    private AndroidDriver ad;
    private TouchAction touchAction;

    public GeneralElements(AndroidDriver ad) {
        this.ad = ad;
        this.touchAction = new TouchAction(ad);
    }

    public void c_l() throws InterruptedException {
        Thread.sleep(13000);

        System.out.println("Pressing car list!");
        touchAction.tap(PointOption.point((100), (800))).perform();
        System.out.println("Scrolling down by swiping up! Repeats 4 times to reach desired vehicle.");
        for(int i = 0; i < 5; i++) {
            touchAction.longPress(PointOption.point((1000), (900))).moveTo(PointOption.point((1000), (0))).release().perform();
        }
        System.out.println("Choosing \"Charice Formula\" named vehicle!");
        touchAction.tap(PointOption.point((1200), (650))).perform();
    }

    public void c_s() throws InterruptedException {
        System.out.println("Going to car settings!");
        TouchAction touchAction = new TouchAction(ad);
        touchAction.tap(PointOption.point((100), (1000))).perform();
        Thread.sleep(3000);
        System.out.println("Scrolling paint options (same as car catalog)!");
        touchAction.longPress(PointOption.point((2130), (800))).moveTo(PointOption.point((2130), (400))).release().perform();
        System.out.println("Pressing dark-blue color!");
        touchAction.tap(PointOption.point((2130), (700))).perform();
        System.out.println("Leaving car settings!");
        touchAction.tap(PointOption.point((100), (1000))).perform();
    }

    public void r() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Press that button already, m8!");
        touchAction.tap(PointOption.point((2130), (1000))).perform();
    }
}
