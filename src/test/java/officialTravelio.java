import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

import java.time.Duration;

public class officialTravelio {

    private WebDriver webDriver;
    public officialTravelio(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    private WebElement findElementWithWait(ExpectedCondition<WebElement> condition) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20)); // Set timeout as needed
        return wait.until(condition);
    }
    @Given("^User open the website Official travelio$")
    public void userOpenTheWebsiteOfficialTravelio() {
        WebElement closeButton = webDriver.findElement((By) ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-close")));
        if (closeButton != null) {
            closeButton.click();
        }

    }
}
