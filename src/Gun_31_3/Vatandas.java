package Gun_31_3;

public class Vatandas {

    String name;
    final int tcNo;

    static int tcSyac = 1001;

    public Vatandas(String name) {
        this.name = name;
        this.tcNo = ++tcSyac;
    }



    @Override
    public String toString() {
        return "Vatandas{" +
                "name='" + name + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
