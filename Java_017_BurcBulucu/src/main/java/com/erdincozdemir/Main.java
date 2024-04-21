package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun;
        String ay;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğdunuz ayı yazı olarak giriniz : ");
        ay = scanner.nextLine();

        System.out.print("Ayın kaçıncı günü doğdunuz : ");
        gun = scanner.nextInt();

        scanner.close();

        switch (ay) {
            case "ocak":
                if( gun >=1 && gun <=21){
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
                break;
            case "şubat":
                if( gun >=1 && gun <=19){
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
                break;
            case "mart":
                if( gun >=1 && gun <=20){
                    System.out.println("Burcunuz Balık");
                } else {
                    System.out.println("Burcunuz Koç");
                }
                break;
            case "nisan":
                if( gun >=1 && gun <=20){
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
                break;
            case "mayıs":
                if( gun >=1 && gun <=21){
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz ikizler");
                }
                break;
            case "haziran":
                if( gun >=1 && gun <=22){
                    System.out.println("Burcunuz ikizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
                break;
            case "temmuz":
                if( gun >=1 && gun <=22){
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
                break;
            case "ağustos":
                if( gun >=1 && gun <=22){
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
                break;
            case "eylül":
                if( gun >=1 && gun <=22){
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
                break;
            case "ekim":
                if( gun >=1 && gun <=21){
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
                break;
            case "kasim":
                if( gun >=1 && gun <=21){
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
                break;
            case "aralık":
                if( gun >=1 && gun <=21){
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
                break;
            default:
                System.out.println("Hatalı değer girişi yapıldı.");
                break;
        }
    }
}