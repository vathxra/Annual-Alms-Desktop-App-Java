package sample;

import java.text.DecimalFormat;

public class Perak extends Harta {
    private double berat;
    private double harga = 9000;

    public Perak(double berat) {
        this.berat = berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public String hitungZakat() {
        double value = berat*harga/40;
        return (new DecimalFormat(".00").format(value));
    }
}