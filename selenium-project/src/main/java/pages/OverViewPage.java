package pages;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage {
    @FindBy(linkText = "Open new Account") private WebElement openAccountLink;

    public void clickOpenAccountLink(){
        openAccountLink.click();
    }
}
