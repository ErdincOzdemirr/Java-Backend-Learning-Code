package com.erdincozdemir.solid;

public class XmlLog implements ILogger {

    @Override
    public boolean Log(String value) {

        System.out.println(value + " xml ye kaydedildi");
        return false;

    }
}