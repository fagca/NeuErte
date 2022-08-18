package Gun_38_odev_2;

import Gun_38_2.Vehicle;

public class Bicycle extends Vehicles implements IVehicle {


    public Bicycle(int speed, int gear) {
        super(++speed, --gear);
    }

    @Override
    public int changeGear() {
        return 0;
    }

    @Override
    public int speedUp() {
        return speed;
    }

    @Override
    public int applyBreakes() {
        return speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "current speed=" + speed +
                ",current gear=" + gear +
                '}';
    }
}

