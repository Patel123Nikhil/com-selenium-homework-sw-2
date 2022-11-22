package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);


    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on computer tab
        driver.findElement(By.linkText("Computers")).click();

        //Find the Computers text
        String expectedMessage = "Computers";
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[1]//a[@href='/computers']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Click on electronics tab
        driver.findElement(By.linkText("Electronics")).click();
        String expectedMessage = "Electronics";
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[2]//a[@href='/electronics']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void serShouldNavigateToApparelPageSuccessfull() {
        //Click on the 'Apparel' tab
        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage = "Apparel";
        //Verify the text 'Apparel'
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[3]//a[@href='/apparel']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        //Click on the 'Digital downloads' tab
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage = "Digital downloads";
        //Verify the text 'Digital downloads
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[4]//a[@href='/digital-downloads']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Click on the 'Books' tab
        driver.findElement(By.linkText("Books")).click();
        String expectedMessage = "Books";
        //Verify the text 'Books'
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[5]//a[@href='/books']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Click on the 'Jewelry' tab
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedMessage = "Jewelry";
        //Verify the text 'Jewelry'
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[6]//a[@href='/jewelry']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //Click on the 'Gift Cards' tab
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage = "Gift Cards";
        //Verify the text 'Gift Cards'
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[7]//a[@href='/gift-cards']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
