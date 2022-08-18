package Gun_38_calisma;

public class Kamyon extends Arac implements IDizel{
    public Kamyon(String model, double motor) {
        super(model, motor);
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public String dizelDegistir() {
        return null;
    }
}
