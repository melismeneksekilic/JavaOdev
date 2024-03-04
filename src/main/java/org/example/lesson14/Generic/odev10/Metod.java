package org.example.lesson14.Generic.odev10;

import java.util.Arrays;
import java.util.List;

public class Metod {
    public static void main(String[] args) {
        List<String> kelimeler = Arrays.asList("kalem", "kitap", "defter", "silgi");
                boolean varMı = kelimeler.stream()
                .anyMatch(oge -> oge.contains("z"));
        if (varMı) {
            System.out.println("Öge bulundu.");
        } else {
            System.out.println("-1");
        }
    }
}
