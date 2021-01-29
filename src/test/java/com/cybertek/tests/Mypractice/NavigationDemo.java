package com.cybertek.tests.Mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search");

        driver.navigate().to("https://www.youtube.com/watch?v=zWEOx7TSM6I");

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();






    }
}
