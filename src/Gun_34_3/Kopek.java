package Gun_34_3;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("hav hav dedi");
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}' + super.toString();
    }
}
