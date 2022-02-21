package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalculatorPage1;
import pages.SearchPage;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static CalculatorPage1 calculatorPage1;

    @BeforeAll
    public static void  init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        calculatorPage1 = new CalculatorPage1(driver);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        searchPage.search("калькулятор");
        searchPage.results.size();
    }

    @Test
    public void test2() {
        driver.get("http://google.com");
        searchPage.search("калькулятор");
        calculatorPage1.getTask();
        calculatorPage1.getFinal();
    }


    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
