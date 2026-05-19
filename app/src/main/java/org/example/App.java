package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Welcome to My First Java App!   ");
        System.out.println("===================================");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("\nHello, " + name + "! Your Gradle app is interactive now!");
        System.out.println("===================================");

        scanner.close();
    }
}