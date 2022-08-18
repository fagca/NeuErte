package Gun_42_1;

import java.util.Scanner;

public class ThrowExample2 {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);

        System.out.print("Kullanıcı: ");
        String userName = oku.nextLine();

        System.out.print("Şifre: ");
        String password = oku.nextLine();

        try {

            if (password.length() < 8)
                throw new Exception("şifre 8 karakterden az olamaz");

            if (password.length() > 15)
                throw new Exception("şifre 15 karakterden fazla olamaz");
        }catch (Exception e)
        {
            System.out.println("Lütfen Dikkat! ");
            System.out.println("Uyari: "+e.getMessage());

        }
    }
}
