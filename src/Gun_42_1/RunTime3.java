package Gun_42_1;

public class RunTime3 {
    public static void main(String[] args) {

        System.out.println("program başladı");
        String str = "asds";
        int a = 5;
        int b = 0;
        int c = 0;

        try {

            char ilkHarf = str.charAt(0);
            c = a / b;
        }catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("kelime boş olduğu için harf alınamadı hata: "+e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("sıfıra bölünemez: "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("diğer: "+e.getMessage());
        }

        System.out.println("program sonu");
        System.out.println("");

    }
}
