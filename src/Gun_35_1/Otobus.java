package Gun_35_1;

public class Otobus extends Arac {

    private int yolcuSayisi;

    public Otobus(String renk, int motor, String marka, int yolcuSayisi) {
        super(renk, motor, marka);
        setYolcuSayisi(yolcuSayisi);
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuSayisi=" + yolcuSayisi +
                '}' + super.toString();
    }
}
