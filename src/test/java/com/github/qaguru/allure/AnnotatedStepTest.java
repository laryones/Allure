package com.github.qaguru.allure;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    private final static String REPOSITORY = "SeleniumHQ/selenium";
    private final static String ISSUE_NAME = "Window Resizing Issue";

    @Test
    public void testGithub() {
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssue(ISSUE_NAME);
    }

}
