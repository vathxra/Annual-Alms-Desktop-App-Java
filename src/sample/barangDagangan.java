package sample;

import java.text.DecimalFormat;

public class barangDagangan extends Harta {
    private double nilaiBarang;
    private double uangDagang;
    private double piutang;
    private double utangJatuhTempo;

    public barangDagangan(double nilaiBarang, double uangDagang, double piutang, double utangJatuhTempo){
        this.nilaiBarang = nilaiBarang;
        this.uangDagang = uangDagang;
        this.piutang = piutang;
        this.utangJatuhTempo = utangJatuhTempo;
    }

    //buat nilai barang
    public void setNilaiBarang(double nilaiBarang) {
        this.nilaiBarang = nilaiBarang;
    }
    public double getNilaiBarang() {
        return nilaiBarang;
    }

    //buat uang dagang
    public void setUangDagang(double uangDagang) {
        this.uangDagang = uangDagang;
    }
    public double getUangDagang() {
        return uangDagang;
    }

    //buat piutang
    public void setPiutang(double piutang) {
        this.piutang = piutang;
    }
    public double getPiutang() {
        return piutang;
    }

    //buat utang jatuh tempo
    public void setUtangJatuhTempo(double utangJatuhTempo) {
        this.utangJatuhTempo = utangJatuhTempo;
    }
    public double getUtangJatuhTempo() {
        return utangJatuhTempo;
    }

    public String hitungZakat() {
        double value = (nilaiBarang + uangDagang + piutang - utangJatuhTempo)/40;
        return (new DecimalFormat(".00").format(value));
    }
}