package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingByClassName {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        driver.manage().window().fullscreen();




        WebElement searchBox=driver.findElement(By.className("gLFyf gsfi"));


        searchBox.sendKeys("Aj loves Shahrizat");



    }
}
