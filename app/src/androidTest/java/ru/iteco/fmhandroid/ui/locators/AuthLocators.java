package ru.iteco.fmhandroid.ui.locators;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import org.hamcrest.Matcher;
import ru.iteco.fmhandroid.R;

public class AuthLocators {

          //авторизация
        public static final Matcher<View> LOGIN_FIELD =
                withId(R.id.login_text_input_layout);
        public static final Matcher<View> PASSWORD_FIELD =
                withId(R.id.password_text_input_layout);
        public static final Matcher<View> LOGIN_BUTTON =
               withId(R.id.enter_button);


    }

