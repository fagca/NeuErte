package Gun_38_1;

public class Daire implements ISekil{
    @Override
    public double alan(double... dizi) {
        return Math.PI*dizi[0]*dizi[0];
    }

    @Override
    public double cevre(double... dizi) {
        return Math.PI*dizi[0]*2;
    }
}
