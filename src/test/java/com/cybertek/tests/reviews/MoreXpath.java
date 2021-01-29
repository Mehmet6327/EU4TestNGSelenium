package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MoreXpath {


     @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        String menuName = "Best Sellers";

        String xpathLocator = "//div[@id='nav-xshop']/*[.='"+menuName+"']";

        WebElement menu = driver.findElement(By.xpath(xpathLocator));

         Thread.sleep(5000);

         menu.click();

    }
}
