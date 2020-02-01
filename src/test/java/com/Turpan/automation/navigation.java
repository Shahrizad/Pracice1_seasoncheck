package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("baby"+ Keys.ENTER);


    }

}
