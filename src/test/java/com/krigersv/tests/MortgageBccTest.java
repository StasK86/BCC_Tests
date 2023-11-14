package com.krigersv.tests;

import com.krigersv.pages.MortgageBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("mortgage")
@Feature("Проверка раздела 'Онлайн ипотека на вторичное жильё'")
@Owner("Stas")

public class MortgageBccTest extends TestBase {

        MortgageBccPage mortgageBccPage = new MortgageBccPage();

        @Test
        @DisplayName("Проверка изменения расчёта калькулятора при нажатии на чекбокс")
        @Severity(SeverityLevel.NORMAL)
        @Link(value = "bcc", url = "https://m.bcc.kz/mges")
        void checkMortgageSection() {
            Allure.step("Открытие раздела 'Онлайн ипотека на вторичное жильё'", () ->
                    mortgageBccPage.openPage());
            Allure.step("Клик по чекбоксу 'Без пенсионных отчислений'", () ->
                    mortgageBccPage.click());
            Allure.step("Проверка, что расчёт калькулятора изменилися", () ->
                    mortgageBccPage.resultCheck());
        }
}
