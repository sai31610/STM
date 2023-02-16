package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.WebDriver.*;

public class Edge
{
    @Test
    public void edge()
    {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://newerp.kluniversity.in/");
        System.out.println(driver.getTitle());
        highlight(driver,driver.findElement(By.id("circle_section")));
        highlight(driver,driver.findElement(By.className("t")));
        highlight(driver,driver.findElement(By.linkText("Login")));
        highlight(driver,driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(5)")));
        highlight(driver,driver.findElement(By.xpath("//li[@id='three']")));
    }
    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}
