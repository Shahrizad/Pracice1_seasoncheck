package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class addRemove {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement addRemove=driver.findElement(By.linkText("Add/Remove Elements"));
        addRemove.click();

        WebElement addElement=driver.findElement(By.className("added-manually"));

        // xpath:       //tagName[@attribute='value']
        // xpath text: //tagName[.='text']
        // css :       tagName[attribute='value']
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();
        addElement.click();





    }













}
