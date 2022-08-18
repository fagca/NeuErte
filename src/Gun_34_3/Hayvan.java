package Gun_34_3;

public class Hayvan {
    String renk;
    int kilo;
    String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo =  kilo;
        this.cinsi = cinsi;
    }

    public void konustu()
    {
        System.out.println("Hayvan konustu");
    }
}
