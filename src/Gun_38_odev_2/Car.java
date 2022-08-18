package Gun_38_odev_2;

public class Car extends Vehicles implements IVehicle{
    public Car(int speed, int gear) {
        super(++speed, --gear);
    }

    @Override
    public int changeGear() {
        return 0;
    }

    @Override
    public int speedUp() {
        return 0;
    }

    @Override
    public int applyBreakes() {
        return 0;
    }
}
