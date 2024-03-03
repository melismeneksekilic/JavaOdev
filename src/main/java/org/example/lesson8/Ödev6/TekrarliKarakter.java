package org.example.lesson8.Ödev6;

import java.util.*;

public class TekrarliKarakter {
    public static void main(String[] args) {
        String kelime1 = "cehalet";
        String kelime2 = "cemal";

        String yeniMetin = tekrarliMetin(kelime1, kelime2);

        System.out.println("Yeni Kelime: " + yeniMetin);
    }

    public static String tekrarliMetin(String kelime1, String kelime2) {
        Set<Character> tekrarEdenKarakter = new HashSet<>();

        for (char karakter : kelime1.toCharArray()) {
            if (kelime2.indexOf(karakter) != -1) {
                tekrarEdenKarakter.add(karakter);
            }
        }

        for (char karakter : kelime2.toCharArray()) {
            if (kelime1.indexOf(karakter) != -1) {
                tekrarEdenKarakter.add(karakter);
            }
        }

        StringBuilder yeniMetinBuilder = new StringBuilder();
        for (char karakter : tekrarEdenKarakter) {
            yeniMetinBuilder.append(karakter);
            // Set içerisindeki harfleri birleştirip yeni kelime oluşturdum.

        }

        return yeniMetinBuilder.toString();
    }
}