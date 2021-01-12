package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vigneshpalanikumar/Downloads/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.id("a-icon a-icon-checkbox")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.linkText("256 GB & above")).click();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.quit();
    }
}
