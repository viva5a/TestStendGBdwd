package autopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;

public class AuthPanel {

    private WebDriver driver;

 /*   public AuthPanel(WebDriver driver, WebElement login, WebElement password, WebElement btnLogin) {
        this.driver = driver;
        this.login = login;
        this.password = password;
        this.btnLogin = btnLogin;
    }*/

    //Username
    @FindBy(xpath = "//input[@class=\"mdc-text-field__input\"]")
    public WebElement login;
    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement password;
    @FindBy(xpath = "//button[@form=\"login\"]")
    public WebElement btnLogin;

  /*  private static final String login = "vistasaxs";
    private final String password = "03d6ac54a0";*/

    public AuthPanel(WebDriver driver) {

        this.driver = driver;
    }

    public void loginIn(){
        this.btnLogin.click();
    }

    public AuthPanel setLogin(String login){
    this.login.sendKeys(login);
         return this;
     }
    public AuthPanel setPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password) {
        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login, login)
                .sendKeys(password)
                .click(this.btnLogin)
                .build()
                .perform();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}



