package Gun_31_4;

import Gun_31_2.Student;

import java.util.Scanner;

public class Ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int gun = 0;
        int saat = 0;
        int dakika = 0;

        System.out.print("gün: "); gun = oku.nextInt();
        System.out.print("saat: "); saat = oku.nextInt();
        System.out.print("dakika: "); dakika = oku.nextInt();

        System.out.println("Sabitler.hesapla(gun,saat,dakika => toplam saniye) = " + Sabitler.hesapla(gun,saat,dakika));










    }
}
