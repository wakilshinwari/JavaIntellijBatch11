package com.Syntax.class24.interfacedemo.Tas1;

public class WebDriverTester {

    public static void main(String[] args) {
        WebDriver [] webDrivers={new ChromeDriver(), new ChromeDriver()};
                for (WebDriver webDriver :webDrivers);

        WebDriver webDriver = null;
        webDriver.openBrowser();
        webDriver.maximizeWindow();
    webDriver.closeBrowser();


        }
    }

