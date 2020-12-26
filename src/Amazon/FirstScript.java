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

//        To scroll the page down
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,2000)");

        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("hmenu-customer-profile")).click();
//        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("happyearth");
//        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/div/input")).click();
//        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
    }
}
