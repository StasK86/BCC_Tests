package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MortgageBccPage {

    private final SelenideElement
            checkboxClick = $("[class='sb-checkbox sb-checkbox-digital-mortgage']"),
            Result = $("[class='digital-mortgage-txts8']");

    public MortgageBccPage openPage() {
        open("https://m.bcc.kz/mges");
        return this;
    }
    public MortgageBccPage click() {
        checkboxClick.click();
        return this;
    }
    public MortgageBccPage resultCheck() {
        Result.$(byText(""))
                .shouldNot(exist);
        return this;
    }
}

