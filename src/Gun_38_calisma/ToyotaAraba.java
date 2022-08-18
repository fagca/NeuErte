package Gun_38_calisma;

public class ToyotaAraba extends Arac implements IElektrik,IGaz{
    public ToyotaAraba(String model, double motor) {
        super(model, motor);
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public String bataryaDegistir() {
        return null;
    }

    @Override
    public String yakitDegistir() {
        return null;
    }
}
