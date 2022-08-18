package Gun_38_calisma;

public class TeslaAraba extends Arac implements IElektrik{
    public TeslaAraba(String model, double motor) {
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
}
