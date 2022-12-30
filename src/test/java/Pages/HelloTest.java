package Pages;

import BaseTest.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HelloTest  {
   public WebDriver driver;
    private HelloPage helloPage;
    @Test
    public void helloTest(){
        helloPage=new HelloPage(driver);
     helloPage.print();
    }

}
