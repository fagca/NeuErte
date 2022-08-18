package Gun_35_1;

public class Arac {
    private String renk;
    private int motor;
    private String marka;

    public Arac() {
    }

    public Arac(String renk, int motor, String marka) {
        setRenk(renk);
        setMotor(motor);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", marka='" + marka + '\'' +
                '}';
    }
}
