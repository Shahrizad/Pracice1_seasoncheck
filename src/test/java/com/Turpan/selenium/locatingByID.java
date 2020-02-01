package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingByID {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userName=driver.findElement(By.id("prependedInput"));

        userName.sendKeys("I love shahrizat.");
    }
}
