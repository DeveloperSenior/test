package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;

    private int hour;
    private String dayHour;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    @Given("Hour {int}")
    public void test_given(int hour) {
        //setUp();
        this.hour =  hour;
    }

    @When("The hour is {int}")
    public void test_when(int hour) {
        this.hour =  hour;
    }

    @Then("The Day hour should be {string}")
    public void test_then(String shouldBeDay) {
        Assertions.assertEquals(shouldBeDay,Utils.getTimeOfDay(this.hour));
    }
}
