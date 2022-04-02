package com.tdea.parcial.gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestThree {

    private WebDriver driver;


    void setUp(String url) {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @Given("The Url {string}")
    public void the_url(String url) throws InterruptedException {
        setUp(url);
        Thread.sleep(1000);
    }
    @When("The email is {string}")
    public void the_email_is(String value) throws InterruptedException {
        Thread.sleep(1000);
        WebElement emailTag = this.driver.findElement(By.id("email"));
        Thread.sleep(1000);
        emailTag.clear();
        emailTag.sendKeys(value);
    }

    @Then("Retrieve password")
    public void should_then() throws InterruptedException {
        Thread.sleep(1000);
        WebElement button = this.driver.findElement(By.id("form_submit"));
        Thread.sleep(1000);
        button.click();
    }


}
