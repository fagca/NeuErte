package Gun_38_odev_3;

import java.util.ArrayList;

public class Amazon extends DeliveryOption{


    public Amazon(int amazonFreeDelivery, int costcoFreeDelivery) {
        super(amazonFreeDelivery, costcoFreeDelivery);
    }



    public int getTotal(int a)
    {

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        ArrayList<Integer> array4 = new ArrayList<>();

        array1.add("$3K");
        array1.add("$200");
        array1.add("1k");



        for (int i = 0; i < array1.size(); i++)
        {
            array1.set(i,array1.get(i).toUpperCase());
            if (array1.get(i).contains("K"))
            {

                array2.add(i,array1.get(i).replaceAll("K","000"));

                System.out.println("array.get(i) = " + array2.get(i));
            }
            else
            {
                array2.add(i, array1.get(i).replaceAll("\\D+","") );
                System.out.println("array.get(i) = " + array2.get(i));
            }
        }
        System.out.println("array2 = " + array2);

        for (int i = 0; i < array2.size(); i++)
        {
            array3.add(i,array2.get(i).replaceAll("\\$",""));
            

        }

        for (String s: array3
             ) {
            array4.add(Integer.parseInt(s));
        }

        System.out.println("array4 = " + array4);

        int toplam=0;
        for (Integer d:array4
             ) {
            toplam += d;

        }
        return toplam;

    }

    public String isShippingFree()
    {
        //if (getTotal()> 5)
            return null;
    }


}
