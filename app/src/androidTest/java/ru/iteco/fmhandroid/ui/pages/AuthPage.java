package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
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
    public MainScreen login(String login, String password) {
        return enterLogin(login)
                .enterPassword(password)
                .pressLoginButton();
    }
}
