package Gun_35_2;

public class Daire extends Sekil {
    private int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlan() {
        return Math.PI*yaricap-yaricap;
    }

    @Override
    public double getCevre() {
        return Math.PI*yaricap*2;
    }
}
