package com.erdincozdemir.solid;

public class DbLog implements ILogger{

    @Override
    public boolean Log(String value) {

        System.out.println(value + " Db ye kaydedildi");
        return false;

    }
}
