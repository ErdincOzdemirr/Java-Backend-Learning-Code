package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter heat: ");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println(heat + "  derece kayak için çok iyi bir sıcaklık.");
        } else if (heat >= 5 && heat < 10) {
            System.out.println(heat + "  derece sinema için çok iyi bir sıcaklık.");
        } else if (heat >= 10 && heat < 25) {
            System.out.println(heat + "  derece piknik için çok iyi bir sıcaklık.");
        } else if (heat >= 25 ) {
            System.out.println(heat + "  derece Yüzme için çok iyi bir sıcaklık.");
        } else {
            System.out.println("Dogru deger girmediniz.");
        }
        scanner.close();
    }
}