package Gun_36_1.Metod;

public class Araba extends Tasit {
    private String renk;


    public Araba(String model) {
        super(model);
    }

    public void arabaYazdir()
    {
        System.out.println("renk = " + renk + super.getModel());
    }
}
