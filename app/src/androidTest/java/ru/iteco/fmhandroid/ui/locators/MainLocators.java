package ru.iteco.fmhandroid.ui.locators;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class MainLocators {

    public static final Matcher<View> MAIN_HEADING =
            allOf(
                    withId(R.id.container_list_news_include_on_fragment_main),
                    withText("Новости")
            );
}
