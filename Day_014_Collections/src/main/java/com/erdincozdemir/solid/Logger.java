package com.erdincozdemir.solid;

public class Logger {

    public ILogger iLogger;

    public Logger(ILogger iLogger){
        this.iLogger=iLogger;
    }

    public void LogKayit(String value)
    {
        iLogger.Log(value);
    }

}
