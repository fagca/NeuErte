package Gun_41_2;

import java.time.LocalDate;
import java.time.Period;

public class peryod {
    //time ve datetime

    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1988,12,21);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);

        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

    }
}
