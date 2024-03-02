package org.example.lesson10.odev7;
    public enum Gezegen {
    MERKUR(1, "MerKür", 5834317, 2439, 59),
    VENUS(2, "VeNüs", 10771050, 6051, 243),
    DUNYA(3, "DünYa", 14959790, 6371, 1),
    MARS(4, "MaRs", 22738880, 3389, 1),
    JUPİTER(5, "JüpiTer", 7790890, 69911, 1),
    SATURN(6, "SaTürn", 143314800, 58232, 1),
    URANUS(7, "UraNüs", 287527100, 25362, 1),
    NEPTUN(8, "NepTün", 449541600, 24622, 1),
    PLUTON(9, "PlüTon", 590612400, 1188, 6);

    public String ad;
    public int sirano;
    public int uzaklik;
    public int yaricap;
    public int donus;

        Gezegen(int sirano, String ad, int uzaklik, int yaricap, int donus) {
            this.sirano = sirano;
            this.uzaklik = uzaklik;
            this.yaricap = yaricap;
            this.donus = donus;
            this.ad = ad;
        }
    public int getSirano() {
        return sirano;
    }
    public int getUzaklik() {
        return uzaklik;
    }
    public int getYaricap() {
        return yaricap;
    }
    public int getDonus() {
        return donus;
    }
    public String getAd(){
            return ad;
    }
    }