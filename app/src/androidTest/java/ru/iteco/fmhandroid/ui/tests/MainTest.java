package ru.iteco.fmhandroid.ui.tests;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pages.AuthPage;
import ru.iteco.fmhandroid.ui.pages.MainScreen;
import ru.iteco.fmhandroid.ui.pages.NewsPage;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainTest {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void successfulLoginTests() throws InterruptedException {
        // Сделайте паузу и посмотрите иерархию
        Thread.sleep(5000);
    }

    @Test
    public void HeadMainTest() { //Заголовок Новости на главной странице
        new MainScreen()
                .verifyOnMainPage();
    }

    @Test
    public void HeadNewsTest() { //Заголовок Новости на главной странице
        new MainScreen()
                .all_News_Head_News();
    }


    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
