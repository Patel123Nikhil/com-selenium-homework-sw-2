package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find login link and click on login link
        clickOnElement(By.linkText("Log in"));
// This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome test element and get the text
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
  @Test
  public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.linkText("Log in")).click();
        //Find the email field element and send the email
      driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
      //Find the password field element
      driver.findElement(By.id("Password")).sendKeys("abc123");
      //Find the login button and click on it
      driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
      //Find the log out text
      String expectedMessage = "Log out";
      //Find the welcome test element and get the text
      WebElement actaulTextMessageElement = driver.findElement(By.xpath("//a[text()='Log out']"));
      String actualMessage = actaulTextMessageElement.getText();
      Assert.assertEquals(expectedMessage, actualMessage);

  }
  @Test
  public void verifyTheErrorMessage() {
      driver.findElement(By.linkText("Log in")).click();
      //Find the email field element and send the email
      driver.findElement(By.id("Email")).sendKeys("bbc123@gmail.com");
      //Find the password field element
      driver.findElement(By.id("Password")).sendKeys("bbc123");
      //Find the login button and click on it
      driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
      //Find the log out text
      String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
              "No customer account found";
      //Find the welcome test element and get the text
      WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
      String actualMessage = actaulTextMessageElement.getText();
      Assert.assertEquals(expectedMessage, actualMessage);
  }
  @After
    public void tearDown(){
        closeBrowser();
  }
}

