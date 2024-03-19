package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HelloTest  {
   public WebDriver driver;
    private HelloPage helloPage;
    @Test
    public void helloTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        assertTrue(driver.getTitle().contains("Google"));
        helloPage=new HelloPage(driver);
        helloPage.print();
        driver.quit();
    }

}
