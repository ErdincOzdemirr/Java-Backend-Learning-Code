package com.erdincozdemir;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = scanner.nextDouble();

        double bodyIndex = weight / (height*height);
        System.out.println("BODY INDEX: " + bodyIndex);
    }
}