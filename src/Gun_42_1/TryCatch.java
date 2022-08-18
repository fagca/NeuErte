package Gun_42_1;

import java.time.LocalDate;
import java.time.Month;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println("program başladı");
            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);
            System.out.println("işlem tamam");
        }catch(Exception e)
        {
            System.out.println("şu hata oldu: "+e.getMessage());
        }


    }
}
