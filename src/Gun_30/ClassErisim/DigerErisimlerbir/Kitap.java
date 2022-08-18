package Gun_30.ClassErisim.DigerErisimlerbir;

public class Kitap {

    int id;
    String name;

    private String password;

        public void sifrAta(String sifre)
    {
        if (sifre.length()<3)
        {
            System.out.println(" Lütfen kurala uygun şifre giriniz ");
        }
        else
        {
            this.password = sifre;
        }
    }

    public void sifreGoster()
    {
        System.out.println("password = " + password);
    }


}
