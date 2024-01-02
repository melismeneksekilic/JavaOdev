
public class Maas {
    public static void maasHesapla(int gunlukUcret, int calisilanGunSayisi) {
        int maas = gunlukUcret * calisilanGunSayisi;

        if (calisilanGunSayisi > 25) {
            int fazlaGunSayisi = calisilanGunSayisi - 25;
            int Prim = fazlaGunSayisi * 1000;
            maas += Prim;
        }

        System.out.println("Kişinin Toplam Maaşı " + maas + " TL kadardır.");
    }

    public static void main(String[] args) {
        int gunlukUcret = 1000;
        int calisilanGunSayisi = 20;

        maasHesapla(gunlukUcret, calisilanGunSayisi);
    }
}
