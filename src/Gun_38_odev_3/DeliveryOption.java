package Gun_38_odev_3;

import java.util.ArrayList;

public class DeliveryOption implements IDeliveryOptions{

    int amazonFreeDelivery = 10000;
    int costcoFreeDelivery = 15000;
    public DeliveryOption(int amazonFreeDelivery, int costcoFreeDelivery) {
        setAmazonFreeDelivery(amazonFreeDelivery);
        setCostcoFreeDelivery(costcoFreeDelivery);
    }





    @Override
    public String getTheTotal() {
        return null;
    }

    @Override
    public String isFreeShipping() {
        return null;
    }

    public int getAmazonFreeDelivery() {
        return amazonFreeDelivery;
    }

    public void setAmazonFreeDelivery(int amazonFreeDelivery) {
        this.amazonFreeDelivery = amazonFreeDelivery;
    }

    public int getCostcoFreeDelivery() {
        return costcoFreeDelivery;
    }

    public void setCostcoFreeDelivery(int costcoFreeDelivery) {
        this.costcoFreeDelivery = costcoFreeDelivery;
    }

    @Override
    public String toString() {
        return "DeliveryOption{" +
                "amazonFreeDelivery=" + amazonFreeDelivery +
                ", costcoFreeDelivery=" + costcoFreeDelivery +
                '}';
    }
}
