package com.tryCloudSelfPractice.steps_definitions;

import com.tryCloudSelfPractice.pages.DashBoardBasePage;
import com.tryCloudSelfPractice.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccessAllMainModules_Step_Definition {

    DashBoardBasePage dashBoardBasePage = new DashBoardBasePage();
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> list) {
List<String> actualList= new ArrayList<>();

           for (WebElement eachElement : dashBoardBasePage.allModulesList){
           actualList.add (eachElement.getAttribute("aria-label"));

       }
        Assert.assertEquals("Not matched", list, actualList);
    }

}
