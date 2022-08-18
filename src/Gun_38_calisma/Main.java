package Gun_38_calisma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TeslaAraba tesa = new TeslaAraba("x",2);
        ToyotaAraba toya = new ToyotaAraba("pirus",1.6);
        Kamyon kam = new Kamyon("ford",3);

        ArrayList<Arac> araclar = new ArrayList<>();
        araclar.add(tesa);
        araclar.add(toya);
        araclar.add(kam);

        for (Arac a: araclar
             ) {

            System.out.println("----------");
            System.out.println(a.getClass().getSimpleName());

            System.out.println("a.getModel() = " + a.getModel());
            System.out.println("a.getMotor() = " + a.getMotor());

            if(a instanceof TeslaAraba)
            {
                System.out.println(  ((TeslaAraba)a).drive() );
                System.out.println(  ((TeslaAraba)a).bataryaDegistir()  );
            }

            if (a instanceof ToyotaAraba)
            {
                System.out.println(  ((ToyotaAraba)a).bataryaDegistir() );
                System.out.println(  ((ToyotaAraba)a).yakitDegistir() );
                System.out.println( ((ToyotaAraba)a).drive() );
            }

            if (a instanceof Kamyon)
            {
                System.out.println( ((Kamyon)a).dizelDegistir() );
                System.out.println( ((Kamyon)a).drive() );
            }

        }

    }
}
