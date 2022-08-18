package Gun_38_calisma2;

import Gun_34_3.Hayvan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Swallow sw = new Swallow("cute","cik cik");
        Cat ct = new Cat("angryface","miyav");
        Shark sh = new Shark("swimmingdog");
        Duck dk = new Duck("donald","vak vak");

        ArrayList<Hayvanlar> arrayList = new ArrayList<>();

        arrayList.add(sw);
        arrayList.add(ct);
        arrayList.add(sh);
        arrayList.add(dk);

        for (Hayvanlar h: arrayList
             ) {
            System.out.println("----------");
            System.out.println(h.getClass().getSimpleName());

            if (h instanceof Swallow)
            {
                System.out.println(sw.isim);
                System.out.println(sw.konusuyor);

                System.out.println(sw.kanat());

                System.out.println(  ((Swallow)h).kanat() );
            }

        }


    }
}
