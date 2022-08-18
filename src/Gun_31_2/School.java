package Gun_31_2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir numarası olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

    public static void main(String[] args) {


        System.out.println("sdt5 = " + Student.sayac);

        Student sdt1 = new Student("Ferhat","Agca");
        Student sdt2 = new Student("Berna","Agca");
        Student sdt3 = new Student("Başak","Agca");
        Student sdt4 = new Student("Tuba","Agca");
        Student sdt5 = new Student("Beyza","Agca");

        System.out.println("sdt1 = " + sdt1);
        System.out.println("sdt2 = " + sdt2);
        System.out.println("sdt3 = " + sdt3);
        System.out.println("sdt4 = " + sdt4);
        System.out.println("sdt5 = " + sdt5);


         // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
         // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
        // TODO: öğrenci sayısı doğru gözükmeli.


    }


}
