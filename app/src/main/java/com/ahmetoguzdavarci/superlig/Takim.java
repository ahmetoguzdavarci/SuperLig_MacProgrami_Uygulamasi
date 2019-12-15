package com.ahmetoguzdavarci.superlig;

public class Takim {
    private String takimAdi;
    private String teknikDirektor;
    private int bayrak;

    public Takim(String takimAdi, String teknikDirektor, int bayrak) {
        this.takimAdi = takimAdi;
        this.teknikDirektor = teknikDirektor;
        this.bayrak = bayrak;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public String getTeknikDirektor() {
        return teknikDirektor;
    }

    public void setTeknikDirektor(String teknikDirektor) {
        this.teknikDirektor = teknikDirektor;
    }

    public int getBayrak() {
        return bayrak;
    }

    public void setBayrak(int bayrak) {
        this.bayrak = bayrak;
    }
}
