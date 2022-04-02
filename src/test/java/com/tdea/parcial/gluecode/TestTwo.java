package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTwo {

    private WebDriver driver;

    private String component;
    private int position;

    void setUp(String url) {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @Given("Url {string}")
    public void url(String url) throws InterruptedException {
        setUp(url);
        Thread.sleep(1000);
    }
    @When("The component {string} and position {int}")
    public void the_component_and_position(String component, Integer position) {
        this.component =  component;
        this.position = position;
    }
    @Then("Execute {string}")
    public void check_then(String task) throws InterruptedException {

        if ("checkboxes".equals(this.component)){
            Thread.sleep(1000);
            Thread.sleep(1000);
            WebElement check = this.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input["+this.position+"]"));
            Thread.sleep(1000);
            check.click();
        }

    }


}
