package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int a,b,c;

            Scanner scanner = new Scanner(System.in);

            System.out.print("a değerini giriniz : ");
            a = scanner.nextInt();

            System.out.print("b değerini giriniz : ");
            b = scanner.nextInt();

            System.out.print("c değerini giriniz : ");
            c = scanner.nextInt();

            if (a>b && a>c){
                System.out.println("En büyük sayi, a");
            } else if (b>a && b>c){
                System.out.println("En büyük sayi, b");
            } else if (c>a && c>b){
                System.out.println("En büyük sayi, c");
            } else {
                System.out.println("Yanlış değer girdiniz.");
            }

    }
}