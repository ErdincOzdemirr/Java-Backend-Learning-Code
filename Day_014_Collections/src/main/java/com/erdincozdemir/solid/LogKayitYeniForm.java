package com.erdincozdemir.solid;

public class LogKayitYeniForm {

    public static void main(String[] args) {

        XmlLog xmlLog = new XmlLog();
        DbLog dbLog = new DbLog();
        JsonLog jsonLog = new JsonLog();
        Logger logger = new Logger(jsonLog);
        logger.LogKayit("303 nolu hata kodu");

    }
}
