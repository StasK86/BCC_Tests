package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DepositBccPage {
    private final SelenideElement

            control = $("[class='form-control']"),
            searchInput = $("[role='listbox']"),
            iinBin = $("[name='iinBin']"),
            name = $("[name='name']"),
            phone = $("[name='phone']"),
            checkbox = $("[class='btn-checkbox']"),
            pressButton = $("[type='submit']"),
            resultComplete = $("[id='genericForm_forms_flash']");


    public DepositBccPage openPage() {
        open("personal/deposits/champion/");
        return this;
    }

    public DepositBccPage click() {
        control.click();
        return this;
    }

    public DepositBccPage choose(String value) {
        searchInput.$(byText(value)).click();
        return this;
    }

    public DepositBccPage choiceIIN(String value) {
        iinBin.setValue(value);
        return this;
    }

    public DepositBccPage choiceName(String value) {
        name.setValue(value);
        return this;
    }

    public DepositBccPage choicePhones(String value) {
        phone.setValue(value);
        return this;
    }

    public DepositBccPage agree() {
        checkbox.click();
        return this;
    }

    public DepositBccPage clickButton() {
        pressButton.click();
        return this;
    }

    public DepositBccPage check() {
        resultComplete.shouldBe(visible);
        return this;
    }
}


