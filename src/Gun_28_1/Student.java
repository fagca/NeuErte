package Gun_28_1;

import java.util.ArrayList;

public class Student {

    String name;
    int maxcredit;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        int toplamMaxCredit = 0;
        for (Lesson l :dersleri
             ) {
            toplamMaxCredit = toplamMaxCredit + l.credit;
            System.out.println("toplamMaxCredit = " + toplamMaxCredit);
        }

        if (toplamMaxCredit+ders.credit <= maxcredit)
        {
            dersleri.add(ders);
            System.out.println(" eklendi "+ ders.name);
        }
        else
        {
            System.out.println(" credit limit aşıldı "+ ders.name +" :" + ders.credit);
        }

    }



}
