package teststend.gb;

import autopage.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authorization extends AbstractTest {

    @Test
    void test() throws InterruptedException {

        getDriver().get("https://test-stand.gb.ru/");
        String firstWindow = getDriver().getWindowHandle();

            new AuthPanel(getDriver())
                    .setLogin("vistasaxs")
                    .setPassword("03d6ac54a0")
                    .loginIn();

    }

}




