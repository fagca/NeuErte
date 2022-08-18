package Gun_39_2;

public abstract class Sekil {

    private String name;

    public abstract double alan();
    public abstract double cevre();




    public void ciz(){
        System.out.println(this.name+"isimli şekil");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        setName(name);
    }
}
