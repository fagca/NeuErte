package Gun_42_1;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Kullanıcı: ");
        String userName = oku.nextLine();

        System.out.print("Şifre: ");
        String password = oku.nextLine();

        if (password.length()<8)
            System.out.println("şifre 8 karakterden az olamaz");

        if (password.length()>15)
            System.out.println("şifre 15 karakterden fazla olamaz");


    }
}
