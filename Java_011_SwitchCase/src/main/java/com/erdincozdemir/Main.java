package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugün Haftanin kacinci günü? : ");
        int day = scanner.nextInt();

        /*
        if(day == 1){
            System.out.println("Bugün Pazartesi");
        } else if(day == 2){
            System.out.println("Bugün Sali");
        } else if(day == 3){
            System.out.println("Bugün Çarşamba");
        } else if(day == 4){
            System.out.println("Bugün Perşembe");
        } else if(day == 5){
            System.out.println("Bugün Cuma");
        } else if(day == 6){
            System.out.println("Bugün Cumartesi");
        } else if(day == 7){
            System.out.println("Bugün Pazar");
        } else {
            System.out.println("Doğru değer girmedin.");
        }
        */

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Sali");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatali Giris");
        }
    }
}