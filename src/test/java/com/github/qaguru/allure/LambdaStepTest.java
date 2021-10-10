package com.github.qaguru.allure;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {

    private final static String REPOSITORY = "SeleniumHQ/selenium";
    private final static String ISSUE_NUMBER = "Window Resizing Issue";

    @Test
    public void testGithub() {

        step("открываем главную страницу", () ->{
            open("https://github.com");
        });


        step("ищем репозиторий " + REPOSITORY, () ->{
        $(".header-search-input").click();
        $(".header-search-input").setValue(REPOSITORY).submit();
        });

        step("переходим в репозиторий", () ->{
        $(linkText(REPOSITORY)).click();
        });

        step("открываем раздел Issues " + REPOSITORY, () ->{
        $(partialLinkText("Issues")).click();
        });

        step("проверяем наличие Issues " + ISSUE_NUMBER, () ->{
        $("#issue_9896_link").shouldHave(text(ISSUE_NUMBER));
        });

    }

}
