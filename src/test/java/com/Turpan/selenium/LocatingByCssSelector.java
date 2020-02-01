package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByCssSelector {

    public static void main(String[] args) {


        // css syntax: tagName[attribute='value']
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchBox=driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));

        searchBox.sendKeys("Best places to go in VA in winter" + Keys.ENTER);






    }
}
