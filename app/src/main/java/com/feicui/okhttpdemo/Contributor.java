package com.feicui.okhttpdemo;

/**
 * Created by AAAAA on 2016/7/8.
 */
public class Contributor {
    String login;
    int contributions;

    @Override
    public String toString() {
        return login + ", " + contributions;
    }
}
