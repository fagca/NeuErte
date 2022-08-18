package Gun_42_1;

public class TryCatch1 {
    public static void main(String[] args) {
        long startTime = 0;
        String str = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan önceki nokta");

            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki nokta");
        }catch (Exception e)
        {
            System.out.println("catch blok çalıştı: " + e.getMessage());
        }
        finally {
            long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println("gecenSure Ms = " + gecenSure);
            System.out.println("try-cath son yapıalcaklar");
        }



        System.out.println("try-catch blok sonrası çalışan kısım");


    }
}
