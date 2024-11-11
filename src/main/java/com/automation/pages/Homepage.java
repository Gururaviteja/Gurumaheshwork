package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;

    // Locators for elements on the homepage
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    // Constructor
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter text in the search box
    public void enterSearchText(String searchText) {
        driver.findElement(searchBox).sendKeys(searchText);
    }

    // Method to click on the search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}
