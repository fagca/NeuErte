package Gun_38_1;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen();
        System.out.println("d.alan(4,5) = " + d.alan(4,5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4,5));


        Daire dr = new Daire();
        System.out.println("dr.cevre(4,5) = " + dr.cevre(4,5));
        System.out.println("dr.alan(4,5) = " + dr.alan(4,5));

        Kare kr = new Kare();
        System.out.println("kr.cevre(4,5) = " + kr.cevre(4));
        System.out.println("kr.alan(4,5) = " + kr.alan(4));

    }
}
