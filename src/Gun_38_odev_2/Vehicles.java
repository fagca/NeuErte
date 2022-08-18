package Gun_38_odev_2;

public class Vehicles {

    int speed;
    int gear;

    public Vehicles(int speed, int gear) {
        setGear(gear);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
