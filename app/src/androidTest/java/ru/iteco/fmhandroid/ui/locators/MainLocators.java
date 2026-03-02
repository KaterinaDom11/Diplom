package ru.iteco.fmhandroid.ui.locators;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class MainLocators {

    public static final Matcher<View> MAIN_HEADING =
            withId(R.id.news_title); //закголовок на главной Новости

    public static final Matcher<View> LOG_OUT_IMAGE =
            withId(R.id.authorization_image_button); // кнопка человечик выйти image

    public static final Matcher<View> LOG_OUT_BUTTON =
            allOf (
                    withId(android.R.id.title), withText("Выйти")); // кнопка выйти после человечка
}
