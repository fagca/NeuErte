package Gun_40_3;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<TechnoKitchen> siparis = new ArrayList<>();

        int secim = 0;
        do {
            yazdir();
            secim = oku.nextInt();

            switch (secim){
                case 1: TechnoKitchen tk = new TechnoKitchen(YemekListesi.ADANAKEBAP);
                siparis.add(tk); break;
                case 2: TechnoKitchen br = new TechnoKitchen(YemekListesi.BORSH);
                    siparis.add(br); break;
                case 3: TechnoKitchen lh = new TechnoKitchen(YemekListesi.LAHMACUN);
                    siparis.add(lh); break;
                case 4: TechnoKitchen pl = new TechnoKitchen(YemekListesi.PALOV);
                    siparis.add(pl); break;
                case 5: siparisYaz1(siparis); break;
            }
        }while (secim <6);
    }

    public static void yazdir()
    {
        System.out.println("***********MENU*********");
        System.out.println("1. Adana Kebap");
        System.out.println("2. Lahmacun");
        System.out.println("3. Borsh");
        System.out.println("4. Palov");
        System.out.println("5. Tamam");
        System.out.println("6. Çıkış");
        System.out.print("Seçim Yap: ");
    }

    public static void siparisYaz1(ArrayList<TechnoKitchen> siparis)
    {

        int adCnt = 0;
        int lahCnt = 0;
        int BorCnt = 0;
        int PalCnt = 0;


        for (TechnoKitchen t : siparis)
        {
            if (t.listesi == YemekListesi.ADANAKEBAP) adCnt++;
            if (t.listesi == YemekListesi.LAHMACUN) lahCnt++;
            if (t.listesi == YemekListesi.BORSH) BorCnt++;
            if (t.listesi == YemekListesi.PALOV) PalCnt++;

        }

        System.out.println("adCnt = " + adCnt);
        System.out.println("lahCnt = " + lahCnt);
        System.out.println("BorCnt = " + BorCnt);
        System.out.println("PalCnt = " + PalCnt);
    }


}




