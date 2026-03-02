package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.ui.pages.MainScreen;
import ru.iteco.fmhandroid.ui.locators.AuthLocators;

public class AuthPage {

    public AuthPage enterLogin(String login) {
        onView(AuthLocators.LOGIN_FIELD)
                .perform(replaceText(login), closeSoftKeyboard());
        return this;

    }

    public AuthPage enterPassword(String password) {
        onView(AuthLocators.PASSWORD_FIELD)
                .perform(replaceText(password), closeSoftKeyboard());
        return this;

    }
   public MainScreen  pressLoginButton() {
       onView(AuthLocators.LOGIN_BUTTON)
               .perform(click());
       return new MainScreen();
   }

    public AuthPage pressLoginButtonExpectingError() { // возвращает ошибку
        onView(AuthLocators.LOGIN_BUTTON)
                .perform(click());
        return this;
    }
    public MainScreen login(String login, String password) { //заполняем логин, пароль и кнопка войти
        return enterLogin(login)
                .enterPassword(password)
                .pressLoginButton();
    }
    public AuthPage verifyAuthScreen() { //найти текст Авторизация при успешном выходе
        onView(withText("Авторизация"))
                .check(matches(isDisplayed()));
        return this;
    }

    public AuthPage verifyAuthScreenError(String login, String password) { //найти текст Авторизация при не успешном выходе
        return enterLogin(login)
                .enterPassword(password)
                .pressLoginButtonExpectingError()
                .verifyAuthScreen ();

    }


}
