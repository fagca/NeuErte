package Gun_38_2;

public class Bus extends Vehicle implements IDeisel{


    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "Şehir içine girme, yavaş sür, yolcuları rahatsız etme";
    }
}
