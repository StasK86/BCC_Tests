package com.krigersv.tests;

import com.krigersv.pages.BankBranchBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("search")
@Feature("Проверка раздела 'Отделения и банкоматы'")
@Owner("Stas")
public class BankBranchBccTest extends TestBase {
    BankBranchBccPage bankBranchBccPage = new BankBranchBccPage();

    @Test
    @DisplayName("Проверка подсказок в поисковой строке")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "bcc", url = "https://www.bcc.kz/")
    void checkHintsTest() {
        Allure.step("Открытие раздела 'Отделения и банкоматы'", () ->
                bankBranchBccPage.openPage());
        Allure.step("Закрытие окна 'Введите название региона'", () ->
                bankBranchBccPage.closeWindow());
        Allure.step("Клик на поле 'Выбор региона'", () ->
                bankBranchBccPage.chooseRegion());
        Allure.step("Выбор из списка", () ->
                bankBranchBccPage.chooseList(random.city));
        Allure.step("Клик по поисковой строке 'Введите адрес'", () ->
                bankBranchBccPage.searchText(random.insertion));
        Allure.step("Проверка", () ->
                bankBranchBccPage.check());
    }
}

