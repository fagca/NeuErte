package Gun_38_odev_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextFile tf = new TextFile("text");

        ArrayList<Files> arrayList = new ArrayList<>();
        arrayList.add(tf);

        for (Files f: arrayList
             ) {

            System.out.println("-----");
            System.out.println(f.getClass().getSimpleName());
            System.out.println(f.getIsim());
            System.out.println( ((TextFile)f).isim );

        }

    }
}
