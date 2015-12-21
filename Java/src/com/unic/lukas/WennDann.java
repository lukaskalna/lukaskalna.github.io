package com.unic.lukas;

public class WennDann {

    public static void main(String[] args) {
        System.out.println("Der erste Input war " + args[0]);
        int zahl = Integer.parseInt(args[0]);

        //kleiner als 100
        if(zahl < 100) {
            System.out.println("kleiner als die Zahl 100");
        }
        else {
            System.out.println("Kategorisierung noch nicht abgeschlossen");
            if (zahl > 100) {
                System.out.println("grösser als die Zahl 100");
            } else if (zahl == 100) {
                System.out.println("exakt gleich gross wie die Zahl 100");
            }
        }
    }
}
