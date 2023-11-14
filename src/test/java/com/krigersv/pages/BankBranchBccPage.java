package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class BankBranchBccPage {
    private final SelenideElement
            searchInput = $("[class='form-input']"),
            closing =  $("[class='btn btn-sm !heading-5 absolute right-0 top-0']"),
            selection = $("[class='heading-5 inline-flex items-center mb-4 cursor-pointer']"),
            list = $("[class='dialog !w-full !max-w-[970px]']"),
            completeResult = $("[class='form-select auto-complete-result']");


    public BankBranchBccPage openPage() {
        open("branches-and-atms/");
        return this;

    }
    public BankBranchBccPage closingWindow() {
        closing.click();
        return this;
    }
    public BankBranchBccPage click() {
        selection.click();
        return this;
    }
    public BankBranchBccPage choice(String value) {
        list.$(byText(value)).click();
        return this;
}

    public BankBranchBccPage typeText(String value) {
        searchInput.setValue(value);
        return this;
    }

    public BankBranchBccPage checkTipsExist() {
        completeResult.shouldBe(visible);
        return this;
    }
}
