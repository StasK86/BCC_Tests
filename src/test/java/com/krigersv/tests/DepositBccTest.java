package com.krigersv.tests;

import com.krigersv.pages.DepositBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("deposit")
@Feature("Проверка раздела 'Депозиты'")
@Owner("Stas")
public class DepositBccTest extends TestBase {
    DepositBccPage depositBccPage = new DepositBccPage();

    @Test
    @DisplayName("Проверка заполнения заявки на Депозит “Чемпион”")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "bcc", url = "https://www.bcc.kz/personal/deposits/champion/")
    void checkApplicationsTest() {
        Allure.step("Открытие раздела 'Депозит Чемпион'", () ->
                depositBccPage.openPage());
        Allure.step("Клик на поле 'Выберите филиал'", () ->
                depositBccPage.click());
        Allure.step("Выбор из списка", () ->
                depositBccPage.choose(random.enteringTasks));
        Allure.step("Ввод в поле 'ИИН' через генератор случайных чисел", () ->
                depositBccPage.choiceIIN(random.bank));
        Allure.step("Ввод в поле 'ФИО' через генератор случайных фамилии, и имени", () ->
                depositBccPage.choiceName(random.name));
        Allure.step("Ввод в поле 'Номер телефона' через генератор случайных чисел", () ->
                depositBccPage.choicePhones(random.number));
        Allure.step("Клик по чекбоксу 'Я согласен на сбор и обработку персональных данных'", () ->
                depositBccPage.agree());
        Allure.step("Клик по кнопке 'Подать заявку'", () ->
                depositBccPage.clickButton());
        Allure.step("Проверка", () ->
                depositBccPage.check());
    }
}