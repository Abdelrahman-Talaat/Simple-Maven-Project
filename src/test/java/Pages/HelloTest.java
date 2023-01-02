package Pages;

import BaseTest.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HelloTest  {
   public WebDriver driver;
    private HelloPage helloPage;
    @Test
    public void helloTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        assertTrue(driver.getTitle().contains("Google"));
        helloPage=new HelloPage(driver);
        helloPage.print();
        driver.quit();
    }

}
