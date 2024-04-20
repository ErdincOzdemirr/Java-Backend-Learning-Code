package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
        //    // göre toplam tutarını ekrana yazdıran programı yazın.
        //    // Armut : 2,14 TL
        //    // Elma : 3,67 TL
        //    // Domates : 1,11 TL
        //    // Muz: 0,95 TL
        //    // Patlıcan : 5,00 TL

        double armut, elma, domates, muz, patlican, toplam;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kg : ");
        armut = scanner.nextFloat();
        System.out.print("Elma Kg : ");
        elma = scanner.nextFloat();
        System.out.print("Domates Kg : ");
        domates = scanner.nextFloat();
        System.out.print("Muz Kg : ");
        muz = scanner.nextFloat();
        System.out.print("Patlican Kg : ");
        patlican = scanner.nextFloat();

        toplam=((armut*2.14)+(elma*3.67) +(domates*1.11)+(muz*0.95)+(patlican*5.00));
        System.out.println("Toplam Ödüyeceğiniz ücret : "+toplam);
        
    }
}