package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class SampleTest {

    @Test
    void checkTitle() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(true));
        BrowserContext browserContext = browser.newContext(new NewContextOptions().setScreenSize(1920, 1080));
        Page page = browserContext.newPage();
        page.navigate("http://localhost:3000");
        Assert.assertEquals(page.title(), "Create Next App");
    }
}
