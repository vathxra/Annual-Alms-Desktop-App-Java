package sample;

import java.text.DecimalFormat;

import static sample.hasilPertanian.Pengairan.*;

public class hasilPertanian extends Harta{
    private double berat;
    enum Pengairan {
        Sungai,
        Alat
    }
    
    public hasilPertanian(double berat) {
        this.berat = berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public String hitungZakat() {
        double value = berat/10;
        return (new DecimalFormat(".00").format(value));
    }

    public String hitungZakat2() {
        double value = berat/20;
        return (new DecimalFormat(".00").format(value));
    }
}
