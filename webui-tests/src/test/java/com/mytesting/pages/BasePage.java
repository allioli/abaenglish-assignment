package com.mytesting.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
  protected WebDriver driver;
  protected ActionBot actionBot;
  protected String windowHandle;
  
  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.actionBot = new ActionBot(driver);
  }

  public void switchToNewChildWindow(){

    String parentWindowHandle="";  
    String childWindowHandle=""; 

    // Find the new child window
    Set <String>handles = driver.getWindowHandles();
    parentWindowHandle = driver.getWindowHandle();
    handles.remove(parentWindowHandle);
    childWindowHandle=handles.iterator().next();

    // Store parent window Handle to switch back to it
    this.windowHandle = parentWindowHandle;

    // Switch to child window
    driver.switchTo().window(childWindowHandle);
  }

  public void switchToParentWindow(){

    driver.switchTo().window(this.windowHandle);
  }
  
}
