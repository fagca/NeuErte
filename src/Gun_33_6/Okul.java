package Gun_33_6;

import Gun_33_5.Ogrenci;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontenjan;

    ArrayList<Ogrenci> ogrenciler = new ArrayList<Gun_33_5.Ogrenci>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);

    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }
}
