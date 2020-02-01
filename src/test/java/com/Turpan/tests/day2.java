package com.Turpan.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement dad=driver.findElement(By.xpath("//a[.='Drag and Drop']"));
       // dad.click();

      Actions action= new Actions(driver);
       action.moveToElement(dad).click().perform();

        WebElement A=driver.findElement(By.cssSelector("div[id='column-a']"));
        WebElement B=driver.findElement(By.cssSelector("div[id='column-b']"));


        action.clickAndHold(A).moveToElement(B).release().perform();

    }
}
