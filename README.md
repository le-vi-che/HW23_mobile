## Проект по автоматизации тестирования мобильной версии сайта [Википедия](https://ru.wikipedia.org/wiki/Заглавная_страница)
<p align="center">
<img title="Wiki" src="media/wiki.jpg">
</p>

## :pushpin: Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Список авто тестов](#tests-список-авто/ручных-тестов)
- [Список проверок, реализованных в автотестах](#arrow_forward-запуск-тестов-из-терминала)
- [Запуск тестов из терминала](#arrow_forward-запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Пример Allure-отчета](#пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

  ## :computer: Использованный стек технологий
  
 <p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/IJ.svg"> 
<img width="6%" title="Appium" src="media/Appium.svg">
<img width="6%" title="Browserstack" src="media/Browserstack.svg">
<img width="6%" title="Java" src="media/java.svg">
<img width="6%" title="Allure Report" src="media/allure.svg">
<img width="6%" title="Gradle" src="media/gradle.svg">
<img width="6%" title="JUnit5" src="media/jUnit5.svg">
<img width="6%" title="GitHub" src="media/gitHub.svg">
<img width="6%" title="Jenkins" src="media/jenkins.svg">
<img width="6%" title="Telegram" src="media/telegram.svg">
<img width="5%" title="Jira" src="media/Jira.svg">
</p>

- В проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/).
- Для сборки проекта в интегрированной среде разработки IntelliJ IDEA используется сборщик проектов <code>Gradle</code>.  
- Для модульного тестирования приложения используется фреймворк <code>JUnit 5</code>.
- Для локального тестирования приложения на мобильных устройствах используется Android Studio и Appium
- Для удаленного тестирования в различных платформах Browserstack
- Allure Report, AllureTestOps и Telegram Bot используются для визуализации результатов тестирования
  
## Список авто тестов
**При запуске удаленно:**
- [x] Проверка обнаружения результатов поиска
- [x] Открытие первой найденной ссылки
- [x] Проверка краткого описания статьи

**При запуске локально:**
- [x] 

## :arrow_forward: Запуск автотестов

### Запуск тестов на удаленном браузере
Локальный запуск тестов
```
gradle clean local_test -DdeviceHost=local

```
Запуск удаленно:
```
gradle clean remote_test -DdeviceHost=remote

```

## <img src="media/jenkins.svg" title="Allure TestOps" width="4%"/> Созданный проект в [Jenkins](https://jenkins.autotests.cloudjob/hw23_mobileTest/)
<p align="center">
<img title="allure-report" src="media/JenkinsProject.png">
</p>

## <img src="media/jenkins.svg" title="Jenkins" width="4%"/> Сборка в Jenkins
<p align="center">
<img title="allure-report" src="media/JenkinsJoba.png">
</p>

## <img src="media/allure.svg" title="Allure TestOps" width="4%"/> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/hw23_mobileTest/5/allure/)
В отчете отображены пройденные автотесты. На приложенном изображении открыт тест кейс, отображены его шаги, прикреплены логи, скрины и видео
<p align="center">
<img title="Allure Overview" src="media/allure-report.png">
</p>

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/35268)

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>
На Dashboard в <code>Allure TestOps</code> отображена статистика пройденных тестов.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/allureTestOps.png">
</p>

## <img src="media/Jira.svg" title="Allure TestOps" width="4%"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1094)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается информация, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/jiraTask.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="40%"  title="Telegram Notifications" src="media/telegramBot.jpg">
</p>

## Видео примера запуска тестов в Selenoid

К каждому тесту в отчете прилагается видео прогона.
<p align="center">
  <img title="Selenoid Video" src="media/videoTest.gif">
</p>
