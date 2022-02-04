package com.oxyzcorp;

import io.cucumber.java.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    private static ChromeDriver chromeDriver;


    @BeforeAll
    public static void steup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdessalam.rouabha\\ChromeDriver\\98\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
       // WebDriver driver = new ChromeDriver();

    }

        @Test
        public void testPage() throws InterruptedException {
            chromeDriver.get("https://www.google.com/");
            //chromeDriver.manage().window().setSize(new Dimension(1758, 1070));
            chromeDriver.findElement(By.name("q")).click();
            chromeDriver.findElement(By.name("q")).sendKeys("Behavior Driven Development");
            chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        }

        @AfterAll
        public static void  cleanning() {

            chromeDriver.close();
    }
}



