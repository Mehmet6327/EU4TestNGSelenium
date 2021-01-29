package com.cybertek.tests.Mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);

        driver.close();

        driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);

        driver.quit();










    }
}
