package Pages;

import org.openqa.selenium.WebDriver;

public class HelloPage {
    private WebDriver driver;
    public HelloPage(WebDriver driver) {
        this.driver=driver;
    }

    public void print(){
        System.out.println("Hello World");
    }
}
