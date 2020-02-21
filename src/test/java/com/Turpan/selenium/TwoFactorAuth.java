package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoFactorAuth {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.get("url");

        WebElement userName=driver.findElement(By.id("id"));
        userName.sendKeys("username");

        WebElement password=driver.findElement(By.id("id"));
        password.sendKeys("password");

        WebElement submit=driver.findElement(By.id("id"));
        submit.click();

        WebElement radioButton=driver.findElement(By.id("id"));
        radioButton.click();



        String otpKeyStr = "6jm7n6xwitpjooh7ihewyyzeux7aqmw2";
        Totp totp=new Totp(otpKeyStr);
        String twoFactorCode=totp.now();

        WebElement otpTextBox=driver.findElement(By.id("ID"));
        otpTextBox.sendKeys(twoFactorCode);

        WebElement login=driver.findElement(By.id("id"));
        login.click();










    }
}
