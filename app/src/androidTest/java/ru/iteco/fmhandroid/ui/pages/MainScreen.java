package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.locators.MainLocators;

public class MainScreen {

    public MainScreen verifyOnMainPage() {
        try {
            Thread.sleep(3000);  // ждём 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(MainLocators.MAIN_HEADING).check(matches(isDisplayed())); // нашли Новости на главной и проверили видимость
        return this;
    }

    public AuthPage log_out() {
        onView(MainLocators.LOG_OUT_IMAGE)
                .check(matches(isDisplayed()))  // проверим, что кнопка видна
                .perform(click());
        onView(MainLocators.LOG_OUT_BUTTON)
                .check(matches(isDisplayed()))
                .perform(click());
        return new AuthPage();
    }





}
