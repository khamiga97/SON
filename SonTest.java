import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SonTest {

    @Test
    public void logIn()  {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get();

        By loginField = By.name("email");
        driver.findElement(loginField).sendKeys();

        By passField = By.name("password");
        driver.findElement(passField).sendKeys();

        By logInButton = By.cssSelector("[type='submit']");
        driver.findElement(logInButton).click();

    }
}
