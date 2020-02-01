package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class popUpHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement popUp1=driver.findElement(By.xpath("//input[@name='alert']"));
        Actions action=new Actions (driver);
        action.moveToElement(popUp1).click().perform();
        Thread.sleep(3000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

            }
}
