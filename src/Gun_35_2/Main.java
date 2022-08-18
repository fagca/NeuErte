package Gun_35_2;

public class Main {
    public static void main(String[] args) {
        Daire daire1 = new Daire(3);
        System.out.println("daire1.getAlan() = " + daire1.getAlan());
        System.out.println("daire1.getCevre() = " + daire1.getCevre());

        Dikdortgen dik1 = new Dikdortgen(5,4);
        System.out.println("dik1 = " + dik1.getAlan());
        System.out.println("dik1.getCevre() = " + dik1.getCevre());

        Kare kar1 = new Kare(3);
        System.out.println("kar1.getAlan() = " + kar1.getAlan());
        System.out.println("kar1.getCevre() = " + kar1.getCevre());



    }
}
