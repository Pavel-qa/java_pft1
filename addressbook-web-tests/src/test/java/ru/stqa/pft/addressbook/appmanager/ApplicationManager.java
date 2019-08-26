package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    private final GroupHelper groupHelper = new GroupHelper();
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\Devel\\Tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        groupHelper.driver = new FirefoxDriver();
        baseUrl = "http://localhost/addressbook/";
        groupHelper.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    public void login(String username, String passw0rd) {
      groupHelper.driver.get("http://localhost/addressbook/");
      groupHelper.driver.findElement(By.name("user")).click();
      groupHelper.driver.findElement(By.name("user")).clear();
      groupHelper.driver.findElement(By.name("user")).sendKeys(username);
      groupHelper.driver.findElement(By.name("pass")).clear();
      groupHelper.driver.findElement(By.name("pass")).sendKeys(passw0rd);
      groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

    public void gotoGroupPage() {
      groupHelper.driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHelper.driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
      try {
        groupHelper.driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        groupHelper.driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = groupHelper.driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
