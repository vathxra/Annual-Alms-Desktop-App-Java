package sample;

import java.text.DecimalFormat;

public class Sapi extends Binatang{
    private int jumlah;

    public Sapi(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String hitungZakat() {
        if(jumlah>=30&&jumlah<=39){
            return("1 ekor sapi (1th)");
        }
        else if(jumlah>=40&&jumlah<=59){
            return("1 ekor sapi betina (2th)");
        }
        else if(jumlah>=60&&jumlah<=69){
            return("2 ekor sapi (1th)");
        }
        else if(jumlah>=70&&jumlah<=79){
            return("1 ekor sapi (1th) & 1 ekor sapi betina (2th)");
        }
        else if(jumlah>=80&&jumlah<=89){
            return("2 ekor sapi betina (2th)");
        }
        else if(jumlah>=90&&jumlah<=99){
            return("3 ekor sapi (1th)");
        }
        else if(jumlah>=100&&jumlah<=109){
            return("2 ekor sapi (1th) & 1 ekor sapi betina (2th");
        }
        else if(jumlah>=110&&jumlah<=119){
            return("2 ekor sapi betina (2th) & 1 ekor sapi (1th");
        }
        else if(jumlah>=120&&jumlah<=129){
            return("4 ekor sapi (1th) atau 3 ekor sapi betina (2th");
        }
        else if(jumlah>=130&&jumlah<=139){
            return("3 ekor sapi (1th) & 1 ekor sapi betina (2th");
        }
        else if(jumlah>=140&&jumlah<=149){
            return("2 ekor sapi (1th) & 2 ekor sapi betina (2th");
        }
        else if(jumlah>=150&&jumlah<=159){
            return("5 ekor sapi (1th)");
        }
        else{
            return ("jumlah min 40 dan max 150");
        }
    }
}
