package Gun_36_1.Poli;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("karabaş");
        Kedi kedi1 = new Kedi("kopuk");

        Hayvan kopek2 = new Kopek("rodi");
        Hayvan kedi2 = new Kedi("tekir");

        kopek1.ses();
        kopek1.kokladi();

        kopek2.ses();

        System.out.println("------");

        ((Kopek)kopek2).kokladi();

        hayvanSes(kopek1);
        hayvanSes(kedi1);



    }

    public static void hayvanSes(Hayvan h)
    {

        h.ses();
    }
}
