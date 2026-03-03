package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.ui.pages.NewsPage;
import ru.iteco.fmhandroid.ui.locators.MainLocators;

public class MainScreen {

    public MainScreen verifyOnMainPage() { // проверка заголовка Новости на главной странице
        try {
            Thread.sleep(3000);  // ждём 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(MainLocators.MAIN_HEADING).check(matches(isDisplayed())); // нашли Новости на главной и проверили видимость
        return this;
    }

    public AuthPage log_out() { // выход из авторизации
        onView(MainLocators.LOG_OUT_IMAGE)
                .check(matches(isDisplayed()))
                .perform(click());
        onView(MainLocators.LOG_OUT_BUTTON)
                .check(matches(isDisplayed()))
                .perform(click());
        return new AuthPage();
    }

    public MainScreen all_News() { // на главной странице развертываем все новости на стрелку
        onView(MainLocators.NEW_INCLUDE)
                .check(matches(isDisplayed()))
                .perform(click())
                .perform(click());
        return this;
    }

    public NewsPage all_News_Head_News() {
        onView(MainLocators.NEW_INCLUDE)
                .check(matches(isDisplayed()))
                .perform(click())
                .perform(click());
        onView(MainLocators.ALL_NEWS)
                .perform(click());

        return new NewsPage().verifyOnNewsPage();  // ← правильно!
    }

}
