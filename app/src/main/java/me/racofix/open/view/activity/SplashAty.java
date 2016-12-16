package me.racofix.open.view.activity;

/**
 * Author: 码农小阿新
 * Date: 2016/9/23
 * Github: https://github.com/racofix
 */
public class SplashAty extends SplashLogicAty {

    @Override public Class getNextActivity2Launch() {
        return MainAty.class;
    }
}


