package com.krigersv.tests;

import com.krigersv.pages.ApplicationBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("сity")
@Feature("Проверка раздела 'Кредиты наличными'")
@Owner("Stas")
public class ApplicationBccTests extends TestBase {
    ApplicationBccPage applicationBccPage = new ApplicationBccPage();

    @Test
    @DisplayName("Проверка заполнения поля 'Оставьте заявку на кредит' при выборе значения из списка")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "bcc", url = "https://www.bcc.kz/")
    void checkLoanApplicationTest() {
        Allure.step("Открытие страницы", () ->
                applicationBccPage.openPage());
        Allure.step("Клик на поле с выпадающим списком 'Выберите филиал'", () ->
                applicationBccPage.clickCity());
        Allure.step("Выбор филиала из списка", () ->
                applicationBccPage.chooseBranch(random.enteringTasks));
        Allure.step("Ввод в поле 'ИИН' через генератор случайных чисел", () ->
                applicationBccPage.choiceIIN(random.bank));
        Allure.step("Ввод в поле 'ФИО' через генератор случайных фамилии, и имени", () ->
                applicationBccPage.choiceName(random.name));
        Allure.step("Ввод в поле 'Номер телефона' через генератор случайных чисел", () ->
                applicationBccPage.choicePhones(random.number));
        Allure.step("Клик по чекбоксу 'Я согласен на сбор и обработку персональных данных'", () ->
                applicationBccPage.checkCheckbox());
        Allure.step("Клик по кнопке 'Подать заявку'", () ->
                applicationBccPage.clickButton());
        Allure.step("Проверка", () ->
                applicationBccPage.checkResult());

    }

    @Test
    @DisplayName("Проверка элементов наличия преимуществ")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "bcc", url = "https://m.bcc.kz/")
    void checkingTheStepsTest() {
        Allure.step("Открытие страницы раздела 'Оставьте заявку на кредит'", () ->
                applicationBccPage.openPage());
        Allure.step("Проверка отображения преимуществ  кредитования в банке 'BCC' ", () ->
                applicationBccPage.checkSection(random.checks));
    }
}
