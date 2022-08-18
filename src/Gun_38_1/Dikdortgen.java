package Gun_38_1;

public class Dikdortgen implements ISekil{


    @Override
    public double alan(double... dizi) {

        if (dizi.length == 1)
            return dizi[0]*dizi[0];

        return dizi[0]*dizi[1];
    }

    @Override
    public double cevre(double... dizi) {

        if (dizi.length == 1) //kare ise
            return dizi[0]*4;

        return (dizi[0]+dizi[1])*2;
    }
}
