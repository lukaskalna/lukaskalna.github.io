package com.unic.lukas;

import java.util.Scanner;

/**
 * Created by Administrator on 21.12.2015.
 */
public class Calculator {
    public static void main(String[] args) throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);


        System.out.println("Taschenrechner");

        int operation = 1;
        try (Scanner scanner = new Scanner(System.in)) {

            while (operation > 0) {

                System.out.println("1 Plus");
                System.out.println("2 Minus");
                System.out.println("3 Mal");
                System.out.println("4 Durch");
                System.out.println("0 Exit");

                System.out.println("Wählen Sie eine Operation aus");

                operation = scanner.nextInt();
                if (operation > 4 ) {
                    System.out.println("Geben Sie eine Zahl zwischen 1 und 4 ein...");
                    continue;
                }
                if (operation == 0) {
                    System.out.println("Tschüss und ä Schöne...");
                    continue;
                }

                System.out.println("Geben Sie die erste Zahl ein:");
                int zahl1 = scanner.nextInt();
                System.out.println("Geben Sie die zweite Zahl ein:");
                int zahl2 = scanner.nextInt();

                if (operation == 1) {
                    System.out.println(zahl1 + zahl2);
                }
                if (operation == 2) {
                    System.out.println(zahl1 - zahl2);
                }
                if (operation == 3) {
                    System.out.println(zahl1 * zahl2);
                }
                if (operation == 4) {
                    System.out.println(zahl1 / zahl2 + " Rest " + zahl1 % zahl2 + " mit Nachkommastellen " + zahl1 / ((double) zahl2));
                }

            }
        }
    }
}
