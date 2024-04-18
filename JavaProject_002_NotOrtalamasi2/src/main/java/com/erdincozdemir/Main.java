package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Değişkenleri oluştur
        int mat,fiz,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();
        System.out.println("Matematik Notunuz : "+ mat);

        System.out.println("fizik Notunuzu Giriniz : ");
        fiz = inp.nextInt();
        System.out.println("fizik Notunuz : "+ fiz);

        System.out.println("kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();
        System.out.println("kimya Notunuz : "+ kimya);

        System.out.println("turkce Notunuzu Giriniz : ");
        turkce = inp.nextInt();
        System.out.println("turkce Notunuz : "+ turkce);

        System.out.println("tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();
        System.out.println("tarih Notunuz : "+ tarih);

        System.out.println("muzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();
        System.out.println("muzik Notunuz : "+ muzik);

        int notToplamlari = (mat+fiz+kimya+turkce+tarih+muzik);
        double notOrtalamasi = notToplamlari/6.0;
        System.out.println("notOrtalamasi "+ notOrtalamasi);

    }
}