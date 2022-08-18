package Gun_40_1;

public class Kartal extends Hayvan {

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("et");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günde 1 kg");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("8 saat uyku");
    }

    @Override
    public void sesi() {
        System.out.println("ciyak");
    }
}
