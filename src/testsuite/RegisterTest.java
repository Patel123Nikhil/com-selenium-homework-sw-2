package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    public void clickOnElement(By by) {
        WebElement registerLink = driver.findElement(by);
        registerLink.click();
    }
@Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){

        //Click on register link
    driver.findElement(By.linkText("Register")).click();

    // Verify the text "Register"
String expectedMessage = "Register";
WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[@class='ico-register']"));
String actualMessage = actualTextMessageElement.getText();
    Assert.assertEquals(expectedMessage, actualMessage);
}

@Test
    public void userSholdRegisterAccountSuccessfully(){
        //Click on register link
    driver.findElement(By.linkText("Register")).click();
// Select the radio button the
driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//Enter first name
    driver.findElement(By.name("FirstName")).sendKeys("Raja");
    //Enter last name
    driver.findElement(By.id("LastName")).sendKeys("Babu");
    //Select Day Month and Year
    driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("15");
    driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("3");
    driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1985");
    //Find the email field and enter the email
    driver.findElement(By.name("Email")).sendKeys("abc123@gmail.com");
    //Find the password field and enter the password in password field
    driver.findElement(By.id("Password")).sendKeys("abc123");
    //Confirm the password in password field
    driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
    //Click on REGISTER button
    driver.findElement(By.xpath("//button[@name='register-button']")).click();
    //Verify the text "Your registration completed"
    String expectedMessage = "Your registration completed";
    WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='result']"));
    String actualMessage = actaulTextMessageElement.getText();
    Assert.assertEquals(expectedMessage, actualMessage);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
