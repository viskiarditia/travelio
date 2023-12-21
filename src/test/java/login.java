import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class login {
    private WebDriver webDriver;
    public login(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User Click button Masuk$")
    public void userClickButtonMasuk() {
        WebElement masukButton = webDriver.findElement(By.xpath("//div[@id='loginBtn']"));
        masukButton.click();
    }

    @Then("^input ALL Field form Login in page and click button Masuk$")
    public void inputALLFieldFormLoginInPageAndClickButtonMasuk() {
        WebElement usernameField = webDriver.findElement(By.id("login-email"));
        usernameField.sendKeys("viskyardhi@gmail.com");
        WebElement passwordField = webDriver.findElement(By.id("login-password"));
        passwordField.sendKeys("1234KataKunci");
        WebElement rememberField = webDriver.findElement(By.id("login-remember"));
        rememberField.click();
        WebElement masukButton = webDriver.findElement(By.id("login-modal-btn"));
        masukButton.click();
    }
}
