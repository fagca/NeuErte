package Gun_38_calisma2;

public class Duck extends Hayvanlar implements ISailing,IFlying{
    @Override
    public String kanat() {
        return null;
    }

    @Override
    public String solungac() {
        return null;
    }

    public Duck(String isim, String konusuyor) {
        super(isim, konusuyor);
    }
}
