package com.erdincozdemir;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısına bir değper ataması yapiniz : ");
        a = input.nextInt();
        System.out.println("A değeri = "+ a);

        System.out.println("--------------");

        Scanner input2 = new Scanner(System.in);
        System.out.println("B sayısına double bir değper ataması yapiniz : ");
        double b = input2.nextDouble();
        System.out.println("B değeri = "+ b);

        System.out.println("--------------");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Ekrana yaz bişeyler");
        String c = input3.nextLine();
        System.out.println("Ekrana yazdıkların : "+c);




    }
}