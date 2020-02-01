package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingByXpath {

    public static void main(String[] args) {

        // xpath syntax: //tagName[@attirbute='value']
        //  xpath Text:  //tagName[.='text']
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        searchBox.sendKeys("shahrizat batnap qaptu, wudan wudan"+ Keys.ENTER);



    }
}
