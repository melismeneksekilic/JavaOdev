package org.example.lesson12.odev9;

public class BolmeIslemiHataYakalama {
    public void bolmeYap(int sayi1, int sayi2) {

        try {
            int bolmeSonucu = sayi1 / sayi2;
            System.out.println("Bölme işleminin sonucu: " +bolmeSonucu);
        }
        catch (ArithmeticException ex) {
                System.out.println("Sıfıra bölme hatası alındı!");
            }
        }
    }
