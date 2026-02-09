import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testSwagLabsLogin() {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name"))
                  .sendKeys("standard_user");

            driver.findElement(By.id("password"))
                  .sendKeys("secret_sauce");

            driver.findElement(By.id("login-button"))
                  .click();

            boolean loggedIn =
                driver.getCurrentUrl().contains("inventory.html");

            System.out.println("Login successful? " + loggedIn);

            System.out.println("If you have any questions, message https://www.linkedin.com/in/inderpsingh/");

            Assert.assertTrue(loggedIn);

        } finally {
            // Copyright © Software and Testing Training https://youtube.com/@QA1
            driver.quit();
        }
    }
}
