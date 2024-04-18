package com.erdincozdemir;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double ucret;

        System.out.print("Kdv hesaplanacak ücreti giriniz : ");
        ucret = scanner.nextDouble();

        System.out.println("Kdv'siz Fiyat : " + ucret);

        double kdvTutari = ucret * 0.18;
        System.out.println("Kdv Tutari : " + kdvTutari);

        double ucretKdvli = ucret + kdvTutari;
        System.out.println("Kdv'li Fiyat : " + ucretKdvli);



    }
}
