package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ApplicationBccPage {
    private final SelenideElement

            citySelection = $("[class='form-control'"),
            listSelection = $("[role='listbox']"),
            formInput = $("[name='iinBin']"),
            searchName = $("[name='name']"),
            phones = $("[name='phone']"),
            pressCheckbox = $("[class='btn-checkbox']"),
            clickButton = $("[type='submit']"),
            result = $("[id='genericForm_forms_flash']");

    private final ElementsCollection footfall = $$("[class='base-section-inner']");

    public ApplicationBccPage openPage() {
        open("personal/loans/cash-credit/");
        return this;
    }

    public ApplicationBccPage clickCity() {
        citySelection.click();
        return this;
    }

    public ApplicationBccPage choice(String value) {
        listSelection.$(byText(value)).click();
        return this;
    }

    public ApplicationBccPage checkSection(List<String> steps) {
        for (String step : steps) {
            footfall.findBy(text(step)).shouldBe(visible);
        }return this;}

    public ApplicationBccPage iinBin(String value) {
        formInput.setValue(value);
        return this;
    }

    public ApplicationBccPage name(String value) {
        searchName.setValue(value);
        return this;
    }

    public ApplicationBccPage phones(String value) {
        phones.setValue(value);
        return this;
    }

    public ApplicationBccPage checkboxLabel() {
        pressCheckbox.click();
        return this;
    }

    public ApplicationBccPage buttonClick() {
        clickButton.click();
        return this;
    }

    public ApplicationBccPage checkResult() {
        result.shouldBe(visible);
        return this;
    }
}

