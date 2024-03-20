package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HelloTest  {
    WebDriver driver;
     HelloPage helloPage;
    @Test
    public void helloTest(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       Assert.assertTrue(driver.getTitle().contains("Gooogle"));
        helloPage=new HelloPage(driver);
        helloPage.print();
        driver.quit();
    }

}
