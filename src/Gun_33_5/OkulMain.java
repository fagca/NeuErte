package Gun_33_5;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Kabataş", 3);
        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        do {
            System.out.print("Öğrenci Adı: ");
            String ad = oku.nextLine();

            System.out.print("Öğrenci soyadı: ");
            String soyad = oku.nextLine();

            System.out.print("Öğrenci yaş: ");
            int yas = okuInt.nextInt();

            if (yas<=15 )
            {
                Ogrenci ogr = new Ogrenci(ad,soyad,yas);
                okul.ogrenciler.add(ogr);
            }
            else
            {
                System.out.println("yaş sebeiyle kayıt alınamadı");
            }

            System.out.println("okul.ogrenciler = " + okul.ogrenciler);

        }while (okul.ogrenciler.size() <= okul.getKontanjan() );

    }
}
