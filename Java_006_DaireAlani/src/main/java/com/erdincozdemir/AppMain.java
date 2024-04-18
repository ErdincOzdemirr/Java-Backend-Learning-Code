package com.erdincozdemir;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Yaricapi giriniz : ");
        double yaricap = scanner.nextDouble();

        double alan = yaricap * yaricap * pi;
        double cevre = 2*yaricap*pi;

        System.out.println("Alan : " + alan );
        System.out.println("Cevre : " + cevre );

    }
}