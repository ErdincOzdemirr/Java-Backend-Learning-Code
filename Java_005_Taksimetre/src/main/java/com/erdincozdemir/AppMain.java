package com.erdincozdemir;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        int km = 0;
        double perKm = 2.2, toplamTutar;
        int startPrice = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers: ");

        km = scanner.nextInt();

        toplamTutar = perKm * km;

        double toplam = toplamTutar + startPrice;

        toplam = (toplam < 20) ? 20 : toplam;

        System.out.println("Ucret : " + toplam);



    }
}