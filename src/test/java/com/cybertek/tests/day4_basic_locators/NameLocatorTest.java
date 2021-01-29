package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fulllscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

       // otomatik name yazma
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");



        //OTOMATIK EMAIL YAZMA
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@cybertek.com");

         //KISA BI YONTEM DIGER ADIYLA LAZY WAY
        //driver.findElement(By.name("email")).sendKeys("mike@cybertek.com");

        //Otomatik dugmeye basmak icin giris icin
       WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //LAZY WAY TO CLICK
       // driver.findElement(By.name("wooden_spoon")).click();

    }
}
