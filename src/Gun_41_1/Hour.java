package Gun_41_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Hour {
    public static void main(String[] args) throws InterruptedException {

        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat+"\r");

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        //özel format

        DateTimeFormatter ozelformat1 = DateTimeFormatter.ofPattern("hh.mm");
        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("hh.mm.ss");

        System.out.println("saat = " + saat.format(ozelformat1));

        int sayac = 0;
        while (sayac<20)
        {
            LocalTime saat2 = LocalTime.now();
            System.out.print("saat2 = " + saat2.format(ozelformat2)+"\r");

            Thread.sleep(1000);
            sayac++;
        }



    }
}
