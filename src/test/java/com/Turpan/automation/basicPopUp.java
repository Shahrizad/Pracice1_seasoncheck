package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class basicPopUp {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwBasicPopup");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement popup=driver.findElement(By.xpath("//button[@type='button']"));
        Actions action=new Actions(driver);
        action.moveToElement(popup).click().perform();

        Thread.sleep(4000);

        WebElement anywhere=driver.findElement(By.xpath("//div[@class='GNHGC04CHJ']"));
        anywhere.click();

    }
}
