package Gun_38_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("model 5", 310);
        ToyotaPrius tp = new ToyotaPrius("pirus",1200);
        Bus bus = new Bus("IVECO",7000);

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(tp);
        arabalar.add(bus);

        for (Vehicle  v : arabalar
             ) {
            System.out.println("--------");
            System.out.println(v.getClass().getSimpleName());

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof TeslaCar)
            {
                System.out.println(  ((TeslaCar)v).drive()   );
                System.out.println(((TeslaCar)v).ChangeBattery());
            }

            if (v instanceof ToyotaPrius)
            {
                System.out.println(((ToyotaPrius)v).drive());
                System.out.println(((ToyotaPrius)v).ChangeBattery());
                System.out.println(((ToyotaPrius)v).changeOil());
            }

            if (v instanceof Bus)
            {
                System.out.println(((Bus)v).drive());
                System.out.println(((Bus)v).changeDiesel());
            }
        }
    }
}
