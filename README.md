
---
### **Проект по автоматизации тестовых сценариев для сайта www.bcc.kz**

<p align="center">
<img src="psv/screenshots/logobcc.png" alt="Jenkins Build" width="1000" height="300">
</p>
<p>Банк ЦентрКредит - один из лидеров банковской системы страны, который &nbsp;35 лет предоставляет простые и удобные продукты и сервисы самых современных технологий во всех регионах Казахстана.<br><br>Сегодня Банк имеет собственную широкую филиальную сеть по республике, обслуживает физических и юридических лиц в 19 филиалах и более 160 отделениях по Казахстану. Клиентами Банка являются более 3 млн. физических и более 140 тыс. юридических лиц.</p>

---
## :notebook: Содержание:

- [Стек технологий](#computer-стек-технологий)
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Команда для запуска](#rocket-команда-для-запуска)
- [Allure отчет](#-allure-отчет)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram чат с ботом](#-уведомления-в-telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#-видео-запуска-тестов-в-selenoid)

---
## :computer: Стек технологий

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="psv/pictures/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="psv/pictures/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="psv/pictures/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="psv/pictures/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="psv/pictures/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="psv/pictures/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="psv/pictures/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="psv/pictures/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://qameta.io/"><img src="psv/pictures/Allure_TO.svg" width="50" height="50" alt="Allure TestOps" title="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="psv/pictures/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="psv/pictures/Jira.svg" width="50" height="50" alt="Jira" title="Jira"/></a>
<a href="https://www.telegram.org/"><img src="psv/pictures/Telegram.svg" width="50" height="50"/></a>
</p>

---
## :clipboard: Тестовые сценарии

1. [Главная страница](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/HomeBccTest.java)
   - :heavy_check_mark:_Проверка элементов на главной странице_
2. [Раздел "Отделения и банкоматы"](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/BankBranchBccTest.java)
   - :heavy_check_mark:_Проверка подсказок в поисковой строке_
3. [Раздел "Кредиты наличными"](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/ApplicationBccTests.java)
   - :heavy_check_mark:_Проверка заполнения поля 'Оставьте заявку на кредит' при выборе значения из списка_
   - :heavy_check_mark:_Проверка элементов наличия преимуществ_
4. [Раздел "Онлайн ипотека на вторичное жильё"](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/MortgageBccTest.java)
   - :heavy_check_mark:_Проверка изменения расчёта калькулятора при нажатии на чекбокс_
5. [Раздел "Депозиты"](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/DepositBccTest.java)
   - :heavy_check_mark:_Проверка заполнения заявки на Депозит “Чемпион”_
6. [Раздел "FX-обменник"](https://github.com/StasK86/BCC_Tests/blob/master/src/test/java/com/krigersv/tests/ExchangerBccTest.java)
   - :heavy_check_mark:_Проверка элементов 'Какие возможности вам дает FX-обменник?'_
   - :heavy_check_mark:_Проверка заполнения поля 'Получить консультацию'_


---
### <img src="psv/pictures/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/BCC_Tests_jenkins/)
<p align="center">
<img src="psv/screenshots/JenkinsScreenshot.png" alt="Jenkins Build" width="1000" height="300">
</p>

____
### Параметры сборки проекта

| Параметр        | Назначение                           |
|-----------------|--------------------------------------|
| BROWSER         | Браузер для запуска                  |
| BROWSER_VERSION | Версия браузера                      |
| BROWSER_SIZE    | Разрешение экрана                    |
| TASK            | Выбор конкретных тестов для запуска  |
| ENVIRONMENT     | Рабочее окружение                    |
| COMMENT         | Комментарий                          |

### Запуск параметризованных автотестов в **Jenkins**

<p align="center">
<img src="psv/screenshots/JenkinsScreenshot2.png" alt="Jenkins Launch" width="1000" height="400">
</p>

## :rocket: Команда для запуска

```bash
clean
${TASK}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-DbaseUrl=${BASE_URL}
-DremoteUrl=${REMOTE_URL}
```

---
## <img src="psv/pictures/Allure_Report.svg" width="50" height="50"/> [Allure](http://192.168.31.186:59047/index.html#) отчет

### Главная страница отчета

<p align="center">
<img src="psv/screenshots/Screenshot2.png" alt="Allure report" width="1000" height="350">
</p>

### Тест-кейсы

<p align="center">
<img src="psv/screenshots/Screenshot1.png" alt="Test Case" width="1000" height="350">
</p>

### Содержание тест-кейсов

- :heavy_check_mark: Подробное описание шагов
- :heavy_check_mark: Тег
- :heavy_check_mark: Критичность теста
- :heavy_check_mark: Автор
- :heavy_check_mark: Ссылка на раздел сайта (для каждый тестов свой раздел)
- :heavy_check_mark: Последний скриншот для каждого теста
- :heavy_check_mark: HTML разметка страницы
- :heavy_check_mark: Логи браузера
- :heavy_check_mark: Видео с прохождением теста

### Графики

<p align="center">
<img src="psv/screenshots/Screenshot3.png" alt="Allure-graph" width="1000" height="400">
</p>

---
## <img src="psv/pictures/Allure_TO.svg" width="50" height="50"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3696/dashboards)

### Dashboards
<p align="center">
<img src="psv/screenshots/Screenshot5.png" alt="TestOps dashboard" width="1000" height="400">
</p>

### Ручные и автоматизированные тест-кейсы
<p align="center">
<img src="psv/screenshots/Screenshot4.png" alt="TestOps dashboard" width="1000" height="400">
</p>

### Запуск автоматизированных тестов в **TestOps**
<p align="center">
<img src="psv/screenshots/Screenshot6.png" alt="TestOps launch" width="1000" height="400">
</p>

---
## <img src="psv/pictures/Jira.svg" width="50" height="50"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-903)

### Задача в Jira

<p align="center">
<img src="psv/screenshots/Screenshot7.png" alt="TestOps launch" width="1000" height="400">
</p>

#### Содержание задачи

- :heavy_check_mark: Цель
- :heavy_check_mark: Задачи для выполнения
- :heavy_check_mark: Тест-кейсы из Allure TestOps
- :heavy_check_mark: Результат прогона тестов в Allure TestOps

---

## <img src="psv/pictures/Telegram.svg" width="50" height="50"/> Уведомления в Telegram чат с ботом

### Уведомление из переписки с чат ботом

<p align="center">
<img src="psv/screenshots/Screenshot8.png" alt="TestOps launch" width="500" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---

## <img src="psv/pictures/Selenoid.svg" height="50"/> Видео запуска тестов в Selenoid

<p align="center">
<img src="psv/videos/video.gif" alt="TestOps launch" width="800" height="400">
</p>

---




