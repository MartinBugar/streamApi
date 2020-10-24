package com.prometheus;

import java.util.Optional;

public class Osoba {

    private String meno;
    private Optional<String> priezvisko;
    private int vek;

    public Osoba(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = Optional.ofNullable(priezvisko);
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Optional<String> getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = Optional.ofNullable(priezvisko);
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String  toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }
}
