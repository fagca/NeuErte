package Gun_34_4;

public class Calisan {
    String ad;
    int maas;
    int maasKatsayisi;

    public Calisan(String ad, int maas, int maasKatsayisi) {
        this.ad = ad;
        this.maas = maas;
        this.maasKatsayisi =  maasKatsayisi;
    }

    public void maasHesapla()
    {
        int maasHesapla = maas*maasKatsayisi;
        System.out.println("maasHesapla = " + maasHesapla);
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ad='" + ad + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
