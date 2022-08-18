package Gun_36_2;

public class Kisi {
    public String ad;
    public String soyad;
    public String gorev;
    public int sube;

    public Kisi(String ad, String soyad, String gorev, int sube) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
        setSube(sube);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public int getSube() {
        return sube;
    }

    public void setSube(int sube) {
        this.sube = sube;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorev='" + gorev + '\'' +
                ", sube=" + sube +
                '}';
    }
}
