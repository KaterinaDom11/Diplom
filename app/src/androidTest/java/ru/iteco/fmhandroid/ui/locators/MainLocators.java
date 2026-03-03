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


    public static final Matcher<View> NEW_INCLUDE =
            withId(R.id.expand_material_button); // стрелка развророта новостей

    public static final Matcher<View> ALL_NEWS =
            allOf(withId(R.id.all_news_text_view), withText("ВСЕ НОВОСТИ"));

    }