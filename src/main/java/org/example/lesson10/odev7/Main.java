package com.java;

import org.example.lesson10.odev7.Gezegen;

public class Main {
    public static void main(String[] args) {

        for(Gezegen gezegen:Gezegen.values()){
            System.out.println( gezegen.getAd() + " Gezegen Bilgileri: " );
            System.out.println("Sıra numarası: " + gezegen.getSirano());
            System.out.println("Uzaklığı: " + gezegen.getUzaklik());
            System.out.println("Yarıçapı: " + gezegen.getYaricap());
            System.out.println("Dönme Süresi: " + gezegen.getDonus());
            System.out.println("     ");
        }
    }
}