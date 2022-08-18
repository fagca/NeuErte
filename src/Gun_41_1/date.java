package Gun_41_1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class date {
    public static void main(String[] args) {


        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek().getValue());

        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("(Locale.GERMANY)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)));
        Locale[] kullaniilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l: kullaniilabilirLokaller
             ) {
            if (l.getDisplayCountry().toLowerCase().contains("new"))
            System.out.println("l.getDisplayCountry() +\" \" +l = " + l.getDisplayCountry() +" " +l);
            
        }

        Locale lokalIzlanda = new Locale("is","IS");
        System.out.println("(Locale IZLANDA)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalIzlanda)));

        //İSTEDİĞİMİZ FORMAT



        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ozelFormat1 = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2 = DateTimeFormatter.ofPattern("dd.MM yyyy");
        System.out.println("ozelFormat2 = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3 = DateTimeFormatter.ofPattern("EEEE.dd.MM yyyy");
        System.out.println("ozelFormat3 = " + tarih.format(ozelFormat3));

        LocalDate tarih1 = LocalDate.of(2020,6,2);
        LocalDate tarih2 = LocalDate.of(2021, Month.FEBRUARY,2);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat3));
        System.out.println("tarih2 = " + tarih2);






    }
}
