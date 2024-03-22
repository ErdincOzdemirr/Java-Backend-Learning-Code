package com.erdincozdemir.solid;

public class JsonLog implements ILogger{
    @Override
    public boolean Log(String value) {

        System.out.println(value + " json a kaydedildi");
        return false;
    }
}
