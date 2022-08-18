package Gun_33_3;

public class Kisi {

    String ad;
    String soyAd;
    private int yas;

    public Kisi(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
    }

    public Kisi() {
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }

    public void yasAta (int yas)
    {
        this.yas = Math.abs(yas);
    }
    public int yasGetir ()
    {
        return yas;
    }
}
