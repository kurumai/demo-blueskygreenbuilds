package it.com.edwardawebb.circleci.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;

public class HomePageIT extends AbstractWebIT {


    @Test
    public void testHomePageButtonsUseProperMarketingCopy() throws Exception {

        WebDriver webDriver = createWebDriver();
        webDriver.get(getBaseUrl());
        assertThat("Carousel Button 1 has incorrect text",webDriver.findElement(By.id("car-btn-1")).getText(),containsString("Request a Quote"));
    }


}
