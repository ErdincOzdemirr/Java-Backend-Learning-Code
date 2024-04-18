package org.example;

public class AppMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a%b);

        int c = a + b;
        System.out.println(c);

        b += a+c;
        System.out.println(b);

        boolean sonuc = (1 != 5);
        System.out.println("1 eşit değildir 5 e "+ sonuc);

        boolean kosul1 = a==c;
        boolean kosul2 = a>=b;
        boolean sonuc1 = kosul1 && kosul2;
        boolean sonuc2 = !( kosul1 || kosul2 );
        System.out.println("(a==c) ve (a>=b) dir " + sonuc1);
        System.out.println("sonuc2 " +  sonuc2);

        System.out.println("-----------Ternary Operatör----------");

        String str = sonuc ? "Dogru" : "Degil";

        System.out.println(str);


    }
}