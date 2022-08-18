package Gun_38_2;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "güzel sürüş";
    }
}
