package teststend.gb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;

public abstract class AbstractTest {

    private static WebDriver driver;


    private static final Long time = 5L;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        driver = new EventFiringWebDriver(new ChromeDriver(options));
        //driver.register(new MyWebDriverEventListener());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void goTo(){
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://test-stand.gb.ru/"),
                "Страница не доступна");
    }
    @AfterAll
    static void close(){
        //driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
