package com.Turpan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenMaxemize {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com");

        driver.manage().window().fullscreen();

      //  driver.manage().window().maximize();


        Thread.sleep(5000);

        driver.close();


    }

}
