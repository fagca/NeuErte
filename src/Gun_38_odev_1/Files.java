package Gun_38_odev_1;

public class Files {
    String isim;

    public Files(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Files{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
