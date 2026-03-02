package ru.iteco.fmhandroid.ui.locators;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;



import android.view.View;
import org.hamcrest.Matcher;
import ru.iteco.fmhandroid.R;

public class AuthLocators {

          //авторизация
        public static final Matcher<View> LOGIN_FIELD =
                  withId(R.id.login_edit_text); //форма логин
        public static final Matcher<View> PASSWORD_FIELD =
                withId(R.id.password_edit_text); // форма пароль
        public static final Matcher<View> LOGIN_BUTTON =
                withId(R.id.enter_button); // кнопка войти


    }




