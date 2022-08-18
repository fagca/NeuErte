package Gun_39_1;

public abstract class BinekOto {

    private String marka;
    private String model;
    private int uretimYili;
    private int vitesAdedi;

    public abstract String getMarka();

    public void setMarka(String marka) {
        this.marka = marka;
    }

    

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
