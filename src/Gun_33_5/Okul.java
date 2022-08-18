package Gun_33_5;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontanjan;
    ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAd, int kontanjan) {
        this.okulAd = okulAd;
        this.kontanjan = kontanjan;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontanjan() {
        return kontanjan;
    }

    public void setKontanjan(int kontanjan) {
        this.kontanjan = kontanjan;
    }
}


