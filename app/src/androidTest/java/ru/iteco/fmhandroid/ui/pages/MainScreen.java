package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import ru.iteco.fmhandroid.ui.locators.MainLocators;

public class MainScreen {

    public MainScreen verifyOnMainPage() {
        onView(MainLocators.MAIN_HEADING)
                .check(matches(isDisplayed()));
        return this;
    }
}
