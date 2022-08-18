package Gun_33_3;

public class KisiMain {

    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        kisi1.ad = "Ferhat";
        kisi1.soyAd = "Agca";
        int yas = -25;

        System.out.println("yas = " + kisi1.yasGetir());

        Kisi kisi2 = new Kisi("Berna", "Agca", -25);
        System.out.println("kisi2 = " + kisi2.yasGetir());



    }
}
