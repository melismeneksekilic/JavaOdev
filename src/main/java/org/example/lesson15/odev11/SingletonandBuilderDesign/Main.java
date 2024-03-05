package org.example.lesson15.odev11.SingletonandBuilderDesign;

public class Main {
    public static void main(String[] args) {

        Daire daire = Daire.DaireBuilder.aDaire()
                .withApartmanadi("Sevgi Apartmanı")
                .withKatbilgisi(8)
                .withAlan(237)
                .withRenk("Beyaz")
                .withOdasayisi(4)
                .build();
        System.out.println("Apartman Adı: " + daire.getApartmanadi() + " Dairenin Kat Bilgisi: " + daire.getKatbilgisi() + " Dairenin Alanı " + daire.getAlan() + " Dairenin Rengi " + daire.getRenk() + " Oda Sayısı: " + daire.getOdasayisi());


        Daire daire1 = DaireSingleton.getInstance();
        System.out.println("Apartman Adı: " + daire.getApartmanadi() + " Dairenin Kat Bilgisi: " + daire.getKatbilgisi() + " Dairenin Alanı " + daire.getAlan() + " Dairenin Rengi " + daire.getRenk() + " Oda Sayısı: " + daire.getOdasayisi());
    }
}
