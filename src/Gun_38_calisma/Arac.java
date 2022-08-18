package Gun_38_calisma;

public class Arac {
    String model;
    double motor;

    public Arac(String model, double motor) {
        setModel(model);

        setMotor(motor);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }
}
