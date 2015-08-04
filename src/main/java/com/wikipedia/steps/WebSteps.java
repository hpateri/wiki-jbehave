package com.wikipedia.steps;

/**
 * Created by Harish Pateri.
 */
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import com.wikipedia.pages.WikipediHomePage;

public class WebSteps {

    WebDriver driver;

    @BeforeStories
    public void set_up() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterStories
    public void tear_down() {
        driver.quit();
    }

    @Given("user is on wiki home page")
    public void user_is_on_home_page() {
        new WikipediHomePage(driver).user_is_on_home_page();
    }

    @When("user enters \"$searchText\" in search box")
    public void user_enters_text(String searchText) {
        new WikipediHomePage(driver).user_enters_text(searchText);
    }

    @When("user clicks on search button")
    public void user_clicks_search_button() {
        new WikipediHomePage(driver).user_clicks_search_button();
    }

    @Then("wiki search page is displayed")
    public void get_page_title() {
        new WikipediHomePage(driver).get_page_title();
    }
}
