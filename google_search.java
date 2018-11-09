package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google_search {
    @Test
    public void WebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

        WebElement searchText = driver.findElement(By.name("q"));
        searchText.sendKeys("espn");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.submit();

        driver.close();

    }

}


