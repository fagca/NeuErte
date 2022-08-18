package Gun_31_1;

public class Ogrenci {



        String name;
        String surName;
        static String okul = "Ziya Gökalp";
    static int sinif = 7;

    public Ogrenci(String name, String surName, String okul) {
        this.name = name;
        this.surName = surName;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", okul='" + okul + '\'' + "sinif: " + sinif+
                '}';
    }
}
