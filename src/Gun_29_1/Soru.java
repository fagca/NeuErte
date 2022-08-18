package Gun_29_1;

import java.util.ArrayList;

public class Soru {
    public static void main(String[] args) {

        //ArrayList<Student> array = new ArrayList<>();

        Student ogr1 = new Student();
        Student ogr2 = new Student();
        Student ogr3 = new Student("fer", 4,"ua",5);


        ogr1.name = "Ferhat";
        ogr1.id = 557;
        ogr1.classRoom = 3;
        ogr1.surName = "Agca";

        ogr2.name = "Berna";
        ogr2.id = 1019;
        ogr2.classRoom = 2;
        ogr2.surName = "Agca";





        System.out.println("ogr1 = " + ogr1.name );
        System.out.println("ogr2 = " + ogr2.name );
        System.out.println("ogr3 = " + ogr3.name );





    }
}
