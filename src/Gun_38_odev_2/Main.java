package Gun_38_odev_2;

public class Main {
    public static void main(String[] args) {
        Bicycle bc = new Bicycle(30,3);
        Car cr = new Car(20,2);

        System.out.println("bc.speed = " + bc.speed);
        System.out.println("bc.gear = " + bc.gear);
        System.out.println("bc.toString() = " + bc.toString());

        System.out.println("cr.speed = " + cr.speed);
        System.out.println("cr.gear = " + cr.gear);
        System.out.println("cr.toString() = " + cr.toString());
    }
}
