package Gun_36_1.Metod;

public class Tasit {

    private String model;

    public Tasit(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
