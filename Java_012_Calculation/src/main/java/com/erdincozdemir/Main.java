package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Değeri giriniz : ");
        double a = scanner.nextDouble();
        System.out.print("2.Değeri giriniz : ");
        double b = scanner.nextDouble();
        System.out.print("| + | - | * | / | Bu 4 işlemden hangisini yapmak istersiniz? :");
        String c = scanner.next();
        switch (c) {
            case "+":
                System.out.println("Toplama Islemi Sonucu : "+ (a + b));
                break;
            case "-":
                System.out.println("Cıkarma Islemi Sonucu : "+ (a - b));
                break;
            case "*":
                System.out.println("Çarpma Islemi Sonucu : "+ (a * b));
                break;
            case "/":
                System.out.println("Bölma Islemi Sonucu : "+ (a / b));
                break;
            default:
                System.out.println("| + | - | * | / | Bu 4 işlemden hangisini yapmak istersiniz?");
                c = scanner.next();
                break;
        }
    }
}