package com.wikipedia.pages;

/**
 * Created by Harish Pateri.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.jbehave.core.junit.JUnitStories;

import java.util.concurrent.TimeUnit;

public class WikipediHomePage {

    private WebDriver driver;

    public WikipediHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void user_is_on_home_page() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");
    }

    public void user_enters_text(String text) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#searchInput")).clear();
        driver.findElement(By.cssSelector("#searchInput")).sendKeys("automation");
    }

    public void user_clicks_search_button() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#searchLanguage + .formBtn")).submit();
    }

    public void get_page_title() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

    }
}
