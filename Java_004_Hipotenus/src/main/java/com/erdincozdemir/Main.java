package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dik üçgenin birinci kenarını gir : ");
        a = scanner.nextInt();
        System.out.print("Dik üçgenin ikinci kenarını gir : ");
        b = scanner.nextInt();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("Hipotanüs : "+c);

    }
}