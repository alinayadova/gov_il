package com.example.gov.framework;

import com.example.gov.model.Reception;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchResultHelper extends HelperBase{
    public SearchResultHelper(WebDriver wd) {
        super(wd);
    }

    public void searchReception(Reception reception) {
        type(By.cssSelector("#autocompleteInput"), reception.getDepartment());

        new Select(wd.findElement(By.cssSelector("#city")))
                .selectByVisibleText(reception.getCity());

    }


}
