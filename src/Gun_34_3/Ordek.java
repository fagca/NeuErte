package Gun_34_3;

public class Ordek extends Hayvan{
    int kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi)
    {
        super(renk, kilo, cinsi);
        this.kanatAcikligi = kanatAcikligi;
    }




    @Override
    public void konustu() {

        super.konustu();
        System.out.println("vak vak dedi");
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}' ;
    }
}
