package com.Syntax.class24.interfacedemo.Tas1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void fidnElement();
}
class ChromeDriver implements WebDriver {   //click on implements and it will create all the implements methods
    @Override

    public void openBrowser() {
        System.out.println("ChromeDriver Opens browser");
    }

    @Override

    public void closeBrowser() {
        System.out.println("ChromeDriver closes browser");
    }

    @Override

    public void maximizeWindow() {
        System.out.println("ChromeDriver maximizes browser");

    }

    @Override
    public void fidnElement() {
        System.out.println("ChromeDriver find browser");
    }

    }

class FireForxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("ChromeDriver Opens browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("ChromeDriver Opens browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("ChromeDriver Opens browser");

    }

    @Override
    public void fidnElement() {
        System.out.println("ChromeDriver Opens browser");

    }
}
