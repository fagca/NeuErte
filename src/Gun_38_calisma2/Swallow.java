package Gun_38_calisma2;

public class Swallow extends Hayvanlar implements IFlying{

    @Override
    public String kanat() {
        return "null";
    }

    public Swallow(String isim, String konusuyor) {
        super(isim, konusuyor);
    }
}
