package com.testinium.steps;

import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepImplementation extends BaseTest {

    public WebDriver driver;

    public StepImplementation() {
        driver = BaseTest.driver;
    }

    @Step("<key> bekle")
    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("<key> css ile tıklanır")
    public void clickByCss(String key) {
        driver.findElement(By.cssSelector(key)).click();
    }

    @Step("<key> id ile tıklanır ve <text> değeri yazılır")
    public void clickAndSendkeys(String key, String text) {
        driver.findElement(By.id(key)).sendKeys(text);
    }
}