package Gun_40_1;

public abstract class Hayvan {

    private String isim;
    private final int id;
    private boolean vahsi;
    private String dogumTarihi;

    static int sayac = 0;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = ++sayac;
        setIsim(isim);

        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);

    }


    public abstract void yiyecegi();


    public abstract void yemekMiktari();

    public abstract void gunlukUykuSuresi();

    public abstract void sesi();


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }



    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }



    @Override
    public String toString() {
        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        sesi();
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}


