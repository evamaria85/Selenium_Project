package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropertyValue;

public class HomePage {
    @FindBy(css = "input[name= username]") private WebElement userNameElement;
    @FindBy(css = "input[name= password]") private WebElement passwordElement;
    @FindBy(css = "button[type= submit]") private WebElement loginButton;

    public void login(){
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("password"));
        loginButton.click();

    }

}
