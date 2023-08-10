package home;

import autopage.AuthPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;
public class HomePage {

    private WebDriver driver;
    @FindBy(xpath = "//a [('Home')]")
    private WebElement btnHome; //Button Home
    @FindBy(xpath = "//a[text()='About']")
    private WebElement btnAbout;//&#x421;&#x441;&#x44B;&#x43B;&#x43A;&#x430;
    @FindBy(xpath = "//a[text()='Contact']")
    private WebElement btnContact;//&#x421;&#x441;&#x44B;&#x43B;&#x43A;&#x430;
    @FindBy(xpath = "//a[contains(text(),'Hello')]")
    private WebElement btnHello;
    @FindBy(xpath = "//span[text()='Profile']/..//span[1]")
    public WebElement btnProfile;
    @FindBy(xpath = "//span[text()='Login']/..//span[1]")
    public WebElement btnnLogin;
    @FindBy(xpath = "//span[text()='Logout']/..//span[1]")
    public WebElement btnLogout;
    @FindBy(xpath = "//h1[text()='Blog']")
    public WebElement titleBlog;
    @FindBy(xpath = "//button[@id='create-btn']")
    public WebElement btnPlusCreate;
    @FindBy(xpath = "//i[contains(text(),'sort')]/..")
    public WebElement btnSort;
    @FindBy(xpath = "//button[@aria-pressed='false']")
    public WebElement btnSortFalse;
    @FindBy(xpath = "//button[@aria-pressed='true']")
    public WebElement btnSortTrue;
    @FindBy(xpath = "//button[contains(@id,'SMUI-form-field-1')]")
    public WebElement radioSwitch;
    @FindBy(xpath = "//button[@aria-checked='true']")
    public WebElement radioSwitchTrue;
    @FindBy(xpath = "//button[@aria-checked='false']")
    public WebElement radioSwitchFalse;
    @FindBy(xpath = "//div[@class='content']/div[contains(@class,'posts')]/a[1]")
    public WebElement postContentFirst;
    @FindBy(xpath = "//div[@class='content']/div[contains(@class,'posts')]/a[1]/h2")
    public WebElement titleContentFirst;
    @FindBy(xpath = "//div[@class='content']/div[contains(@class,'posts')]/a[1]/div")
    public WebElement summerContentFirst;
    @FindBy(xpath = "//a[text()='Previous Page']")
    public WebElement paginationPreviousPage;
    @FindBy(xpath = "//a[text()='Next Page']")
    public WebElement paginationNextPage;
    @FindBy(xpath = "//h1[text()='Create Post']")
    public WebElement titleCreatePost;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage clickHome() {
        btnHome.click();
        return this;
    }

    public HomePage clickAbout() {
        btnAbout.click();
        return this;
    }

    public HomePage clickContact() {
        btnContact.click();
        return this;
    }

    public HomePage clickProfile() {
        btnProfile.click();
        return this;
    }

    public HomePage clickLogin() {
        btnnLogin.click();
        return this;
    }

    public HomePage clickLoLogout() {
        btnLogout.click();
        return this;
    }

    }
