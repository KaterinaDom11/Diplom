package ru.iteco.fmhandroid.ui.locators;

import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class NewsLocator {

    public static final Matcher<View> NEWS_HEADING =allOf(
            withId(R.id.news_title),
            withText("Новости"),
            withParent(withParent(withId(R.id.container_list_news_include))),
            isDisplayed());

}
