package com.Turpan.Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    String logInTitle="Dashboard";
    String pass="Test passed";
    String fail="Test failed";
    String[] cridentials={"user187","UserUser123"};
    String url="https://qa2.vytrack.com/user/login";

    public void login(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to(url);
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys(cridentials[0]);

        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys(cridentials[1]+ Keys.ENTER);

        if(driver.getTitle().equals(logInTitle)){

            System.out.println(pass);
        }else {
            System.out.println(fail);
        }

        driver.close();


    }


}
