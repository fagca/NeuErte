package Gun_33_6;

import Gun_33_5.Ogrenci;

import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

        Okul okul = new Okul("Kabataş", 3);

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        do {
            System.out.print("ad giriniz: ");
            String ad1 = okuInt.nextLine();

            System.out.print("soyad giriniz");
            String soyad1 = oku.nextLine();

            System.out.print("yas giriniz: ");
            int yas1 = oku.nextInt();

            if (yas1<15) {
                Ogrenci ogr1 = new Ogrenci(ad1, soyad1, yas1);
                okul.ogrenciler.add(ogr1);
            }
            else {
                System.out.println("istelen yaş aralığında değil");
            }

        }while (okul.ogrenciler.size() < okul.getKontenjan());



    }

}
