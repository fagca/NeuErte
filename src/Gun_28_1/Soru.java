package Gun_28_1;

public class Soru {

    public static void main(String[] args) {

        Lesson ders1 = new Lesson();
        ders1.name = "math";
        ders1.credit = 3;

        Lesson ders2 = new Lesson();
        ders2.name = "java";
        ders2.credit = 5;

        Lesson ders3 = new Lesson();
        ders3.name = "pyt";
        ders3.credit = 3;

        Student ogr1 = new Student();

        ogr1.name = "Ferhat";
        ogr1.maxcredit = 10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);



    }



}
