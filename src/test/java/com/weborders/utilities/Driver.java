package com.weborders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver (){};
    private static WebDriver driver;

public static WebDriver getDriver(){
    if (driver == null){
    String browser = "chrome";
    switch (browser){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        default:
            throw new RuntimeException("Browser is not implemented yet: "+ browser);
    }

    }
    return driver;
}


}
