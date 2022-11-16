package com.tryCloudSelfPractice.pages;

import com.tryCloudSelfPractice.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardBasePage {
    public DashBoardBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "ul[id='appmenu']>li[data-id='dashboard']")
    public WebElement dashboardModule;

    @FindBy(css = "ul[id='appmenu']>li[data-id='files']")
    public WebElement fileModule;

@FindBy(css = "ul[id='appmenu']>li[data-id='photos']")
public WebElement photosModule;

@FindBy(css = "ul[id='appmenu']>li[data-id='activity']")
public WebElement activityModule;


@FindBy(css = "ul[id='appmenu']>li[data-id='spreed']")
public WebElement talkModule;

    @FindBy(css = "ul[id='appmenu']>li[data-id='mail']")
    public WebElement mailModule;


    @FindBy(css = "ul[id='appmenu']>li[data-id='contacts']")
    public WebElement contactsModule;


    @FindBy(css = "ul[id='appmenu']>li[data-id='circles']")
    public WebElement circlesModule;


    @FindBy(css = "ul[id='appmenu']>li[data-id='calendar']")
    public WebElement calendarModule;



    @FindBy(css = "ul[id='appmenu']>li[data-id='deck']")
    public WebElement deckModule;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id]//a[@aria-label]") // //ul[@id='appmenu']//li[@data-id]
    ////ul[@id='appmenu']// span[normalize-space(text()) = 'Files']

    public List<WebElement> allModulesList;



}
