package org.example.lesson15.odev11.SingletonandBuilderDesign;

public class Daire {
    private String apartmanadi;
    private String renk;
    private int katbilgisi;
    private int odasayisi;
    private int alan;

    public static final class DaireBuilder {
        private String apartmanadi;
        private String renk;
        private int katbilgisi;
        private int odasayisi;
        private int alan;

        private DaireBuilder() {
        }

        public static DaireBuilder aDaire() {
            return new DaireBuilder();
        }

        public DaireBuilder withApartmanadi(String apartmanadi) {
            this.apartmanadi = apartmanadi;
            return this;
        }

        public DaireBuilder withRenk(String renk) {
            this.renk = renk;
            return this;
        }

        public DaireBuilder withKatbilgisi(int katbilgisi) {
            this.katbilgisi = katbilgisi;
            return this;
        }

        public DaireBuilder withOdasayisi(int odasayisi) {
            this.odasayisi = odasayisi;
            return this;
        }

        public DaireBuilder withAlan(int alan) {
            this.alan = alan;
            return this;
        }

        public Daire build() {
            Daire daire = new Daire();
            daire.renk = this.renk;
            daire.alan = this.alan;
            daire.apartmanadi = this.apartmanadi;
            daire.odasayisi = this.odasayisi;
            daire.katbilgisi = this.katbilgisi;
            return daire;
        }
    }

    public String getApartmanadi() {
        return apartmanadi;
    }

    public void setApartmanadi(String apartmanadi) {
        this.apartmanadi = apartmanadi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKatbilgisi() {
        return katbilgisi;
    }

    public void setKatbilgisi(int katbilgisi) {
        this.katbilgisi = katbilgisi;
    }

    public int getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(int odasayisi) {
        this.odasayisi = odasayisi;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }
}
