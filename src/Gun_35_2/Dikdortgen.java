package Gun_35_2;

public class Dikdortgen extends Sekil {
    private int uzunluk;
    private  int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    @Override
    public double getAlan() {
        return genislik*uzunluk;
    }

    @Override
    public double getCevre() {
        return 2*(genislik+uzunluk);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }
}
