package sample;

import java.text.DecimalFormat;

public class Kambing extends Binatang{
    private int jumlah;

    public Kambing(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String hitungZakat() {
        if(jumlah>=40&&jumlah<=120){
            return("1 ekor kambing (1th)");
        }
        else if(jumlah>=121&&jumlah<=200){
            return("2 ekor kambing");
        }
        else if(jumlah>=201&&jumlah<=300){
            return("3 ekor kambing");
        }
        else if(jumlah>=301&&jumlah<=400){
            return("4 ekor kambing");
        }
        else if(jumlah>=401&&jumlah<=500){
            return("5 ekor kambing");
        }
        else if(jumlah>=501&&jumlah<=600){
            return("6 ekor kambing");
        }
        else if(jumlah>=601&&jumlah<=700){
            return("7 ekor kambing");
        }
        else if(jumlah>=701&&jumlah<=800){
            return("8 ekor kambing");
        }
        else if(jumlah>=801&&jumlah<=900){
            return("9 ekor kambing");
        }
        else if(jumlah>=901&&jumlah<=1000){
            return("10 ekor kambing");
        }
        else{
            return ("jumlah min 40 dan max 1000");
        }
    }
}