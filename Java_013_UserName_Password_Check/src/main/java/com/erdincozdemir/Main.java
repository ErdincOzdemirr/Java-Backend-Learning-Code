package com.erdincozdemir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName, password;

        System.out.print("Enter your username: ");
        userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("UserName and Password are Correct. Welcome " + userName);
        } else {
            System.out.println("UserName and Password are incorrect. Please try again.");
            System.out.print("Enter your username: ");
            userName = scanner.nextLine();

            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        }
    }
}