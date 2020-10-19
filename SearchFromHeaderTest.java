package com.example.gov.tests;

import com.example.gov.model.Reception;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFromHeaderTest extends TestBase {

    @Test
    public void typeInSearchFieldTest() {
        String searchItem = "קבלת קהל";
        app.header().typeInSearchField("קבלת קהל");
        app.header().clickOnTheLoupe();
        String pageName = app.getSearchResultPageTitle();
        System.out.println(pageName);
        Assert.assertTrue(pageName.contains(searchItem));
    }

    @Test
    public void SearchReceptionFromHeader() {
        String searchItem = "קבלת קהל";
        app.header().clickOnReception();

        String pageName = app.getPageTitle();
        System.out.println(pageName);
        Assert.assertTrue(pageName.contains(searchItem));
    }

    @Test
    public void SearchAshdodReceptionFromHeader() {

        app.header().clickOnReception();
        app.searchResult()
                .searchReception(new Reception()
                        .setDepartment("משרד הרישוי").setCity("אשדוד"));


        // Assert.assertTrue(pageName.contains(searchItem));
    }

    @Test(dataProvider = "receptionFromCSV")
    public void SearchAshdodReceptionFromCSV(Reception reception) {

        app.header().clickOnReception();
        app.searchResult().searchReception(reception);

        // Assert.assertTrue(pageName.contains(searchItem));
    }

}


