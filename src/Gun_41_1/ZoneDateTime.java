package Gun_41_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneDateTime {
    public static void main(String[] args) {
        //Başka zaman bölgelereinin saatlerini alma, dilim alma

        ZonedDateTime zdtLokal = ZonedDateTime.now();
        System.out.println("zst = " + zdtLokal);




        Set<String > zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z:zamanBolgeleri
             ) {
            if (z.toLowerCase().contains("stan"))
            System.out.println("z = " + z);
            //Asia/Istanbul
            
        }

        ZoneId zoneLON = ZoneId.of("Europe/London");
        ZonedDateTime zdtLON = ZonedDateTime.now(zoneLON);

        System.out.println("zdtLON =  " + zdtLON);

        DateTimeFormatter gosterimSablonu = DateTimeFormatter.ofPattern(" EEEE  dd.MM.yyyy hh:mm");
        System.out.println("zdtLON = " + zdtLON.format(gosterimSablonu));


    }
}
