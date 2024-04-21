package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tr, muz;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = scanner.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = scanner.nextInt();
        System.out.print("Türkce notunuzu giriniz: ");
        tr = scanner.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muz = scanner.nextInt();

        int ortalama = (mat + fiz + kim + tr + muz)/5;

        if (ortalama >= 55) {
            System.out.println("Ortmalamaniz : "+ortalama+", Sinifi geçtiniz.");
        } else if (ortalama < 55) {
            System.out.println("Ortmalamaniz : "+ortalama+", Çalışmaya devam ediniz. Sınıfta Kaldiniz.");
        } else {
            System.out.println("Değerleri kontrol ediniz");
        }


    }
}