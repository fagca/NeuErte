package Gun_38_2;

public class TeslaCar extends Vehicle implements IElectric {


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeBattery() {
        return "Batarya 50 yıl gider";
    }

    @Override
    public String drive() {
        return "otonom sürüş";
    }
}
