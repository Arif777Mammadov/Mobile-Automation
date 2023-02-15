package Steps;

import Driver.Driver;
import Elements.GeneralElements;
import io.cucumber.java.en.*;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;

/*
Important notes:
For some odd reasons for proper testing you need to put your phone into album mode before running:
you need to have bottom side to the left instead of default to the right; otherwise:
you won't be able to interact with buttons at coordinates at X>2100 (Race and Settings buttons)
Though setting your phone solves "Race button issue", Settings button is still unavailable...
Screen size seen by automator: 2130x1070
*/

public class Derby3main {

    private static AndroidDriver ad;

    @Given("Open game")
    public static void open_game() throws MalformedURLException {
        ad = Driver.getDriver();
    }

    GeneralElements a_d = new GeneralElements(ad);

    @When("Press car list")
    public void car_list() throws InterruptedException {
        a_d.c_l();

        //touchAction.tap(PointOption.point((2130), (600))).perform();
    }

    @Then("Car settings")
    public void car_settings() throws InterruptedException {
        a_d.c_s();
    }

    @And("RACE!!!")
    public void race() throws InterruptedException {
        a_d.r();
    }
}