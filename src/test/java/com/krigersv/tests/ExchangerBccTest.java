package com.krigersv.tests;

import com.krigersv.pages.ExchangerBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


    @Tag("exchanger")
    @Feature("Проверка раздела 'FX-обменник'")
    @Owner("Stas")

    public class ExchangerBccTest extends TestBase {

        ExchangerBccPage exchangerBccPage = new ExchangerBccPage();

        @Test
        @DisplayName("Проверка элементов 'Какие возможности вам дает FX-обменник?'")
        @Severity(SeverityLevel.NORMAL)
        @Link(value = "bcc", url = "https://www.bcc.kz/personal/savings/fx-exchange/")
        void checkingElementsTest() {
            Allure.step("Открытие раздела 'FX-обменник'", () ->
                    exchangerBccPage.openPage());
            Allure.step("Проверка отображения преимуществ онлайн площадки для обмена валюты ", () ->
                    exchangerBccPage.checkSection(random.explore));
        }

        @Test
        @DisplayName("Проверка заполнения поля 'Получить консультацию'")
        @Severity(SeverityLevel.NORMAL)
        @Link(value = "bcc", url = "https://www.bcc.kz/personal/savings/fx-exchange/")
        void checkingTheFillingTest() {
            Allure.step("Открытие раздела 'FX-обменник'", () ->
                    exchangerBccPage.openPage());
            Allure.step("Ввод в поле 'ФИО' через генератор случайных фамилии, и имени", () ->
                    exchangerBccPage.name(random.name));
            Allure.step("Ввод в поле 'ИИН' через генератор случайных чисел", () ->
                    exchangerBccPage.iinBin(random.bank));
            Allure.step("Ввод в поле 'Номер телефона' через генератор случайных чисел", () ->
                    exchangerBccPage.phones(random.number));
            Allure.step("Клик по чекбоксу 'Я согласен на сбор и обработку персональных данных'", () ->
                    exchangerBccPage.checkboxLabel());
            Allure.step("Клик по кнопке 'Подать заявку'", () ->
                    exchangerBccPage.buttonClick());
            Allure.step("Проверка", () ->
                    exchangerBccPage.checkResult());
    }
}
