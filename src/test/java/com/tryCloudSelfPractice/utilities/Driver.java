package com.tryCloudSelfPractice.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    };


    private static InheritableThreadLocal <WebDriver>  driverPool = new InheritableThreadLocal<>();


    public static WebDriver getDriver(){
        if(driverPool.get() == null){
            String browserType = ConfigurationReader.getProperty("browser").toLowerCase();
            switch(browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

        }

        return driverPool.get();
    }

    public static void driverClose(){
        if(driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }

    }



}
