package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.locators.MainLocators;
import ru.iteco.fmhandroid.ui.locators.NewsLocator;

public class NewsPage {

    public NewsPage verifyOnNewsPage() {
        try {
            Thread.sleep(3000);  // ждём 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(NewsLocator.NEWS_HEADING).check(matches(withText("Новости"))); // нашли Новости на странице Новости
        return this;
    }




    }
