package com.cybertek.tests.day6_Css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1 {

    public static void main(String[] args) throws InterruptedException {

        //Test Case 1


//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://www.ebay.com/");
//
//        WebElement searchbox = driver.findElement(By.id("gh-ac"));
//        searchbox.sendKeys("Iphone");
//
//        WebElement searchbutton = driver.findElement(By.id("gh-btn"));
//        searchbutton.click();
//
//        String result = driver.findElement(By.className("srp-controls__count-heading")).getText().split(" ")[0];
//        System.out.println(result);
//
//       driver.quit();
//
//
//        //Test Case 2
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://www.ebay.com/");
//
//        WebElement searchbox2 = driver.findElement(By.id("gh-ac"));
//        searchbox2.sendKeys("Selenium");
//
//        WebElement searchbutton3 = driver.findElement(By.id("gh-btn"));
//        searchbutton3.click();
//
//        String title = driver.getTitle();
//
//        if(title.contains("Selenium")){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAIL");
//        }
//
//        driver.quit();
//
//

           // TEST CASE



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.com/");

        Thread.sleep(3000);

        WebElement searchbox4 = driver.findElement(By.id("searchInput"));
        searchbox4.sendKeys("Selenium webdriver");

        Thread.sleep(3000);

        WebElement searchbutton4 = driver.findElement(By.xpath("//i[text()='Search']"));
        searchbutton4.click();

        WebElement clickTitle = driver.findElement(By.linkText("Selenium (software)"));
        clickTitle.click();
        Thread.sleep(3000);


        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if(currentUrl.contains("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();


























    }


}
