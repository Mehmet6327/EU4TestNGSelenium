package com.cybertek.tests.Mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTtitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String title = driver.getTitle();

        System.out.println("title = " + title);



        driver.quit();

    }
}
