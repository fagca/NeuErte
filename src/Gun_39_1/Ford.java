package Gun_39_1;

public class Ford extends BinekOto{

    @Override
    public String getMarka() {
        return "Ford";
    }

    @Override
    public int getUretimYili() {
        System.out.println("üretildiği yıl: ");
        return super.getUretimYili();
    }


}
