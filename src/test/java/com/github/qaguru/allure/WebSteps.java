package com.github.qaguru.allure;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repo}")
    public void searchForRepository(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").setValue(repo).submit();
    }


    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();

    }

    @Step("Открываем раздел Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }


    @Step("Проверяем Issue с названием {issueName}")
    public void shouldSeeIssue(String issuename) {
        $("#issue_9896_link").shouldHave(text(issuename));
    }
}
