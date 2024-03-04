package org.example.lesson14.Generic.odev10;

public class Jenerik <T>{
    public void islem (T item){
        System.out.println(item);
    }

    public static void main(String[] args) {
        Jenerik <Integer> integerJenerik = new Jenerik<>();
        integerJenerik.islem(55);

        Jenerik <String> StringJenerik = new Jenerik<>();
        StringJenerik.islem("Jenerik Sınıf Oluşturma");

        Jenerik <Double> doubleJenerik = new Jenerik<>();
        doubleJenerik.islem(8.5);


    }
}
