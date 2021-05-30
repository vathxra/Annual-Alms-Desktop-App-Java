package sample;

import java.text.DecimalFormat;

public class mataUang extends Harta {
        private double simpanan;

        public mataUang(double simpanan) {
            this.simpanan = simpanan;
        }

        public void setSimpanan(double simpanan) {
            this.simpanan = simpanan;
        }

        public double getSimpanan() {
            return simpanan;
        }

        public String hitungZakat() {
            double value = simpanan/40;
            return (new DecimalFormat(".00").format(value));
        }
    }