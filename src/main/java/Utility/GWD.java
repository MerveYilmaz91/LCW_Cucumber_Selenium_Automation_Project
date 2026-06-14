package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {
    private static ThreadLocal<WebDriver> threads;

    public WebDriver getDriver() {

        if (threads.get() == null) {
            WebDriver driver = new ChromeDriver();
            threads.set(driver);
        }
        return threads.get();
    }

}
