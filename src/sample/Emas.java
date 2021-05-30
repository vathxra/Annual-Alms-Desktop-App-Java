package sample;

import java.text.DecimalFormat;

public class Emas extends Harta {
    private double berat;
    private double harga = 874000;

    public Emas(double berat) {
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
