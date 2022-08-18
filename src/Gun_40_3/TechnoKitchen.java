package Gun_40_3;

import java.util.ArrayList;

public class TechnoKitchen {

    YemekListesi listesi;


    public TechnoKitchen(YemekListesi listesi) {
        this.listesi = listesi;
    }


    @Override
    public String toString() {
        return "TechnoKitchen{" +
                "listesi=" + listesi +
                '}';
    }
}
