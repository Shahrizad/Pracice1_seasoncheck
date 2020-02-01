package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {



    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwBasicButton");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement normalButton=driver.findElement(By.xpath("//button[@id='gwt-debug-cwBasicButton-normal']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(normalButton).click().perform();
        Thread.sleep(4000);

        Alert alert=driver.switchTo().alert();
        alert.accept();


    }
}
