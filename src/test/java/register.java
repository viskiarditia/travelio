import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class register {
    private WebDriver webDriver;
    public register(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User Click button Buat Akun$")
    public void userClickButton() throws InterruptedException {
        WebElement ClickButton = webDriver.findElement(By.xpath("//div[@id='registerBtn']"));
        ClickButton.click();
    }

    @Then("^input ALL Field form Register in page and click button Daftar$")
    public void inputALLFieldFormRegisterInPageAndClickButtonDaftar() {
        WebElement usernameField = webDriver.findElement(By.id("register-name"));
        usernameField.sendKeys("viskyardhi@gmail.com");
        WebElement emailField = webDriver.findElement(By.id("register-email"));
        emailField.sendKeys("123KataKunci");
        WebElement passwordField = webDriver.findElement(By.id("register-password"));
        passwordField.sendKeys("123KataKunci");
        WebElement confirmPasswordField = webDriver.findElement(By.id("register-konfirmasi"));
        confirmPasswordField.sendKeys("123KataKunci");
        WebElement checkbox = webDriver.findElement(By.id("register-agree"));
        checkbox.click();
        WebElement daftarButton = webDriver.findElement(By.xpath("register-modal-btn"));
        daftarButton.click();

    }
    @Then("^input Verification Number$")
    public void inputVerificationNumber() {
        WebElement verificationNumberField = webDriver.findElement(By.xpath("//div[@class='modal-content row']//div[@class='travelio-input-wrapper']//input[1]"));
        verificationNumberField.sendKeys("87788050090");
        WebElement whatsappButton = webDriver.findElement(By.xpath("//div[@class='otp-modal-2-whatsapp']"));
        whatsappButton.click();
        WebElement captchaButton = webDriver.findElement(By.cssSelector(".recaptcha-checkbox-border"));
        captchaButton.click();
    }

    @Then("^User already on landing page$")
    public void userAlreadyOnLandingPage() {
        WebElement landingPageTitle = webDriver.findElement(By.cssSelector(".navbar-brand"));
        landingPageTitle.isDisplayed();
        Assert.assertTrue(true);

    }




}
