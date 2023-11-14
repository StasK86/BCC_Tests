package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ExchangerBccPage {
    private final SelenideElement

            formInput = $("[name='iinBin']"),
            searchName = $("[name='name']"),
            phones = $("[name='phone']"),
            pressCheckbox = $("[class='btn-checkbox']"),
            clickButton = $("[type='submit']"),
            result = $("[id='genericForm_forms_flash']");

    private final ElementsCollection pace = $$("[class='container constructor-blocks']");

    public ExchangerBccPage openPage() {
        open("personal/savings/fx-exchange/");
        return this;

    }

    public ExchangerBccPage checkSection(List<String> steps) {
        for (String step : steps) {
            pace.findBy(text(step)).shouldBe(visible);
        }
        return this;
    }


    public ExchangerBccPage iinBin(String value) {
        formInput.setValue(value);
        return this;
    }

    public ExchangerBccPage name(String value) {
        searchName.setValue(value);
        return this;
    }

    public ExchangerBccPage phones(String value) {
        phones.setValue(value);
        return this;
    }

    public ExchangerBccPage checkboxLabel() {
        pressCheckbox.click();
        return this;
    }

    public ExchangerBccPage buttonClick() {
        clickButton.click();
        return this;
    }

    public ExchangerBccPage checkResult() {
        result.shouldBe(visible);
        return this;
    }
}

