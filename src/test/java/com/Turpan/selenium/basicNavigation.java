package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //There are 2 kinds of navigation
        //1. driver.get();

       // driver.get("https://www.google.com");

        //2. driver.navigate

        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();




    }
}
