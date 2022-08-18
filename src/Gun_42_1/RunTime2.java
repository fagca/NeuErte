package Gun_42_1;

import java.util.Scanner;

public class RunTime2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {


            try {


                System.out.print("1. sayıyı giriniz: ");
                int sayi1 = oku.nextInt();

                System.out.print("2. sayıyı giriniz: ");
                int sayi2 = oku.nextInt();


            System.out.println("bolum: " + (sayi1 / sayi2));
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
                i--;
            }
        }

    }
}
