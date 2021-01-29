package com.cybertek.tests.Mypractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");



        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expextedEmail = "mike@cybertek.com";

        emailInputBox.sendKeys(expextedEmail);

        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        if(expextedEmail.equals(actualEmail)){
            System.out.println("\"PASS\" = " + "PASS");
        }else{
            System.out.println("\"FAIL\" = " + "FAIL");
        }
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        String expextedMessage = "Your e-mail's been sent!";

        String actualMessage = actualConfirmationMessage.getText();

        if(expextedMessage.equals(actualMessage)){
            System.out.println("\"PASS\" = " + "PASS");
        }else{
            System.out.println("\"FAIL\" = " + "FAIL");
            System.out.println("expextedMessage = " + expextedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }



        driver.quit();


















    }
}
