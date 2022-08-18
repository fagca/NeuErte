package Gun_38_calisma2;

public class Hayvanlar implements IAnimal{
    String isim;
    String konusuyor;

    public Hayvanlar(String isim) {
        setIsim(isim);
    }

    public Hayvanlar(String isim, String konusuyor) {
        setIsim(isim);
        setKonusuyor(konusuyor);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKonusuyor() {
        return konusuyor;
    }

    public void setKonusuyor(String konusuyor) {
        this.konusuyor = konusuyor;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "isim='" + isim + '\'' +
                ", konusuyor='" + konusuyor + '\'' +
                '}';
    }

    @Override
    public String food() {
        return "besleniyor";
    }
}
