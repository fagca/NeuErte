package Gun_30.ClassErisim.Soru1;

public class Banka {
    public static void main(String[] args) {

        Musteri mst1 = new Musteri();
        mst1.hesapID = 1;
        mst1.name = "ferhat";
        mst1.surName = "agca";

        mst1.musteriHesap = new Hesap();

        mst1.musteriHesap.paraYatir(100);
        mst1.musteriHesap.paraYatir(200);
        mst1.musteriHesap.paraCek(50);
        mst1.musteriHesap.paraCek(75);
        System.out.println("mst1.musteriHesap = " + mst1.musteriHesap);





    }
}
