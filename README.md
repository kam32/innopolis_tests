# Innopolis tests
Сами тесты находятся по ссылке https://github.com/kam32/innopolis_tests/blob/master/src/test/java/tests/UiTests.java
## Использованные инструменты:
* Java
* Gradle
* JUnit5
* Owner
* Selenide
* Jenkins
* Selenoid
* Allure Report
* Allure TestOps (EE)
* Telegram Notifications
* Jira

## Скриншоты
***
Запуск тестов организован в Jenkins. Посмотреть можно по ссылке https://jenkins.autotests.cloud/job/C03-kam75-innopolis/
Тесты могут запускаться параллельно.
***
### Allure Report 
***
Отчет о прохождении тестов Allure Report можно посмотреть по ссылке https://jenkins.autotests.cloud/job/C03-kam75-innopolis/3/allure
***
![alt-AllureReport](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureReport1.png "AllureReport")
![alt-AllureReport](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureReport2.png "AllureReport")
![alt-AllureReport](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureReport3.png "AllureReport")
### Selenoid
***
Для контейнеризации тестов использован Selenoid.
***
![alt-Selenoid](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/Selenoid.gif "Selenoid")
### Allure TestOps (EE) 
***
В качестве системы управления тестами использован Allure TestOps.  
***
![alt-AllureTestOps](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureTestOps1.png "AllureTestOps")
![alt-AllureTestOps](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureTestOps2.png "AllureTestOps")
![alt-AllureTestOps](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/AllureTestOps3.png "AllureTestOps")
### Jira
***
Создана задача в Jira. К ней добавлены тест-кейсты, информация о запусках тестов.
***
![alt-Jira](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/Jira1.png "Jira")
![alt-Jira](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/Jira2.png "Jira")
***
### Telegram Notifications
***
После окончания тестов результаты отправляются в Telegram
***
![alt-TelegramNotifications](https://github.com/kam32/innopolis_tests/raw/master/src/test/resources/images/Telegram.png "Telegram")




