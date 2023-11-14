package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DepositBccPage {
    private final SelenideElement

            selection1 = $("[class='form-control']"),
            searchInput = $("[role='listbox']"),
            searchInput2 = $("[name='iinBin']"),
            searchInput3 = $("[name='name']"),
            phone = $("[name='phone']"),
            checkbox = $("[class='btn-checkbox']"),
            pressButton = $("[type='submit']"),
            resultComplete = $("[id='genericForm_forms_flash']");


    public DepositBccPage openPage() {
        open("personal/deposits/champion/");
        return this;
    }
    public DepositBccPage click() {
        selection1.click();
        return this;
    }
    public DepositBccPage listBox(String value) {
        searchInput.$(byText(value)).click();
        return this;
    }

    public DepositBccPage typeText(String value) {
        searchInput2.setValue(value);
        return this;
    }
    public DepositBccPage type(String value) {
        searchInput3.setValue(value);
        return this;
    }
    public DepositBccPage phone(String value) {
        phone.setValue(value);
        return this;
    }

    public DepositBccPage label() {
        checkbox.click();
        return this;
    }
    public DepositBccPage button() {
        pressButton.click();
        return this;
    }

    public DepositBccPage check() {
        resultComplete.shouldBe(visible);
        return this;
    }
}


