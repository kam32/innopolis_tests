package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class UiTests extends TestBaseUi {

    @Test
    @AllureId("1752")
    @Feature("Burger menu")
    @DisplayName("Проверить, что в бургер-меню содержится кнопка \"ГОРОД\"")
    void checkBurgerMenuContent() {
        step("Открываем главную страницу", () -> {
            open("");
        });
        step("Кликнуть на бургер-меню", () -> {
            $(".burger").click();
        });
        step("Проверить, что в верхнем меню 2-ым слева является кнопка \"ГОРОД\"", () -> {
            $("header .menu a", 1).shouldHave(text("ГОРОД"));
        });
    }

    @Test
    @AllureId("1753")
    @Feature("Burger menu")
    @DisplayName("Проверить количество тегов в бургер-меню")
    void checkTagsSize() {
        step("Открываем главную страницу", () -> {
            open("");
        });
        step("Кликнуть на бургер-меню", () -> {
            $(".burger").click();
        });
        step("Проверить, что количество тегов в бургер-меню равно 23", () -> {
            $$(".mmTags a").shouldHaveSize(23);
        });
    }

    @Test
    @AllureId("1754")
    @Feature("For citizen")
    @DisplayName("Проверить корректность открытия страницы \"Банки\" ")
    void checkBankPage() {
        HashMap<Integer, String> namesOfBlocksOnBankPage = new HashMap<Integer, String>() {{
            put(1, "Отделение Ак Барс Банка");
            put(2, "Банкоматы Сбербанка");
            put(3, "Отделение Сбербанка");
            put(4, "Банкоматы Ак Барс Банка");
        }};

        step("Открываем главную страницу", () -> {
            open("");
        });
        step("Кликнуть на бургер-меню", () -> {
            $(".burger").click();
        });
        step("Кликнуть на пункт меню \"Жителю\"", () -> {
            $("header .menu").$(byText("Жителю")).click();
        });
        step("Кликнуть на пункт меню \"Банки\"", () -> {
            $(".menuLeft").$(byText("Банки")).click();
        });
        step("Проверить, что изображение в шапке загрузилось", () -> {
            $(".picHeadImg img").shouldBe(image);
        });
        step("Проскроллить вниз", () -> {
            $(".newsList").scrollIntoView(false);
        });
        step("Проверить, что картинки на 4-х блоках загрузились", () -> {
            $$(".newsList .newsPic>img").filter(image).shouldHaveSize(4);
        });
        step("Проверить названия блоков", () -> {
            namesOfBlocksOnBankPage.entrySet().stream().forEach(x -> {
                step("Проверить, что блок " + x.getKey() + " содержит: " + x.getValue(), () -> {
                    $(".newsList .newsName", x.getKey() - 1).shouldHave(text(x.getValue()));
                });
            });
        });
    }

    @Test
    @AllureId("1755")
    @Feature("Business Form")
    @DisplayName("Отправка пустой формы обратной связи")
    void checkBusinessFormFeedback() {
        step("Открываем бизнес раздел", () -> {
            open("https://innopolis.com/business/");
        });
        step("Нажать на \"Отправить заявку\"", () -> {
            $$(byText("Отправить заявку")).find(cssClass("btn")).scrollIntoView(false).click();
        });
        step("Кликнуть на \"Отправить заявку\" в нижней части формы", () -> {
            $(byValue("Отправить заявку")).click();
        });
        step("Проверить, что появилось 5 предупреждений у полей о необходимости заполнить данные", () -> {
            $$("#business_city_business .lineForm input.error").shouldHaveSize(5);
        });
    }

    @Test
    @AllureId("1756")
    @Feature("University ")
    @DisplayName("Проверка раздела \"Бакалавриат\" ")
    void checkBachelorSection() {
        step("Открываем Университет Иннополис", () -> {
            open("https://innopolis.university/");
        });
        step("Нажать на \"Бакалавриат\"", () -> {
            $(".uni-main__activities__links").$(byText("Бакалавриат")).click();
        });
        step("Нажать на \"Основные курсы\"", () -> {
            $$(".block-university-centers-faq .expand-panel").find(text("Основные курсы")).click();
        });
        step("Проверить, что раздел \"Основные курсы\" содержит \"Mathematical Analysis\"", () -> {
            $$(".block-university-centers-faq .expand-panel").
                    find(text("Основные курсы")).shouldHave(text("Mathematical Analysis"));
        });
    }
}


