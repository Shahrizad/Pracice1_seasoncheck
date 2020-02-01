package com.Turpan.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//  1. go to google
// 2. enter google translate and search
//3. enter google transtlate page
//4. translate from English to Chinese
//5. translate "I love ahmetjan"
public class googleTranslate {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search=driver.findElement(By.cssSelector("input[ class='gLFyf gsfi']"));
        search.sendKeys("google translate"+ Keys.ENTER);

        WebElement Translate=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div/div[1]/a/h3"));
        Actions action = new Actions(driver);
            action.moveToElement(Translate).click().perform();

            WebElement Language1=driver.findElement(By.cssSelector("div[class='sl-more tlid-open-source-language-list']"));
            action.moveToElement(Language1).click().perform();
            WebElement English=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[3]/div[22]/div[2]"));
            action.moveToElement(English).click().perform();

            WebElement Language2=driver.findElement(By.cssSelector("div[class='tl-more tlid-open-target-language-list']"));
            action.moveToElement(Language2).click().perform();
            WebElement Chinese=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/div[16]/div[2]"));
            action.moveToElement(Chinese).click().perform();


            Thread.sleep(2000);

            WebElement textbox1=driver.findElement(By.id("source"));
            textbox1.sendKeys("I love you AJ"+Keys.ENTER);

            Thread.sleep(2000);

            driver.close();



    }
}
