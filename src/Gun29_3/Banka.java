package Gun29_3;

public class Banka {
    String name;
    int kurulusYil;
    int subeSayisi;

    public Banka() {
    }

    public Banka(String name, int kurulusYil, int subeSayisi) {
        this.name = name;
        this.kurulusYil = kurulusYil;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", kurulusYil=" + kurulusYil +
                ", subeSayisi=" + subeSayisi +
                '}';
    }
}
