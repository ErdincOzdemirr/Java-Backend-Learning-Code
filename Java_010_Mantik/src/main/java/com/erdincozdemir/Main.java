package com.erdincozdemir;

public class Main {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = a + b;

        boolean kosul1 = ( a == b);
        boolean kosul2 = ( a <= c);

        boolean sonuc = kosul1 && kosul2;
        System.out.println(sonuc);
        int d = (a<b) ? 2:3;
        System.out.println(d);

    }
}