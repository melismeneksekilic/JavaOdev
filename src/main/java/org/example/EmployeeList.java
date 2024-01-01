package org.example;

public class EmployeeList {
    public static void main (String [] args) {

        Employee calisan1 = new Employee();
        Employee calisan2 = new Employee();
        Employee calisan3 = new Employee();
        Employee calisan4 = new Employee();

        calisan1.ad = "Melis";
        calisan1.soyad = "Donus";
        calisan1.yas = 30;
        calisan1.bolum = "Test";
        calisan1.id = 188;

        calisan2.ad = "Esra";
        calisan2.soyad = "Cıbır";
        calisan2.yas = 32;
        calisan2.bolum = "Yazılım";
        calisan2.id = 256;

        calisan3.ad = "Gozde";
        calisan3.soyad = "Hazır";
        calisan3.yas = 31;
        calisan3.bolum = "Tasarım";
        calisan3.id = 567;

        calisan4.ad = "Reyhan";
        calisan4.soyad = "Dilek";
        calisan4.yas = 28;
        calisan4.bolum = "Kalite";
        calisan4.id = 845;


        calisan1.calisan();
        calisan2.calisan();
        calisan3.calisan();
        calisan4.calisan();

    }
}
