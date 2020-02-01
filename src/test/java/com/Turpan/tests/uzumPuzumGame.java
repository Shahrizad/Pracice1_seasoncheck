package com.Turpan.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uzumPuzumGame {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        //locators: id,class,xpath,css,name,linkText,partialLinkText
        // xpath:  //tagName[@attribute='value']
        // css"     tageName[attribute='value]
        WebElement search=driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));

        search.sendKeys("uighurjhbjhbhj"+ Keys.ENTER);


    }
}
