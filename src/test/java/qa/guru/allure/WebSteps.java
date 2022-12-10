package qa.guru.allure;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Open main page")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Looking for repository {repo}")
    public void searchForRepository(String repo) {
        $(".header-search-input").setValue(repo).pressEnter();
    }

    @Step("Open repository {repo}")
    public void openRepository(String repo) {
        $(linkText(repo)).click();

    }

    @Step("Open issues tab")
    public void openIssuesTab() {
        $("#issues-tab").click();

    }

    @Step("Assert that issue exists")
    public void assertIssueExists(String issue) {
        $(withText(issue)).should(exist);

    }


}
