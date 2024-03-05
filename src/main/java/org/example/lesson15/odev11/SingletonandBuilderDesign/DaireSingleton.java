package org.example.lesson15.odev11.SingletonandBuilderDesign;
public class DaireSingleton {
    private static Daire instance;

    // Private constructor to prevent instantiation from outside
    private DaireSingleton() {
    }

    // Public method to get the singleton instance
    public static Daire getInstance() {
        // Lazy initialization
        if (instance == null) {
            synchronized (DaireSingleton.class) {
                if (instance == null) {
                    instance = Daire.DaireBuilder.aDaire()
                            .withApartmanadi("Default Apartman")
                            .withKatbilgisi(0)
                            .withAlan(0)
                            .withRenk("Beyaz")
                            .withOdasayisi(0)
                            .build();
                }
            }
        }
        return instance;
    }
}


