package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;

import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class HomeBccPage {

    private final ElementsCollection
            menuPanel = $$("[class='container constructor-blocks']");


    public HomeBccPage openPage() {
        open("/");
        return this;

    }
    public HomeBccPage checkMenuPanelExist(List<String> menu) {
        for (String section : menu) {
            menuPanel.findBy(text(section)).should(exist);}
        return this;
    }
}
