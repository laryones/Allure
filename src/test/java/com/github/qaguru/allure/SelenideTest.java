package com.github.qaguru.allure;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void testGithub() {
        // Open site github
        open("https://github.com");

        // Search repository
        $(".header-search-input").click();
        $(".header-search-input").setValue("SeleniumHQ/selenium").submit();

        // Open repository
        $(linkText("SeleniumHQ/selenium")).click();

        // Open issue
        $(partialLinkText("Issues")).click();

        // Check have issue #9896
        $("#issue_9896_link").shouldHave(text("Window Resizing Issue"));








    }

}
