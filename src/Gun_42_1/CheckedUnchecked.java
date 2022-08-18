package Gun_42_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUnchecked {
    public static void main(String[] args) throws FileNotFoundException {
        // java derki yani yazılımcıya
        // bıraktığı hatalara unchecked exception
        // ama öyle komutlar ki, bunların hata kontrolü yapmadan
        // yani try catch alamadan izin vermem
        // bu gibi hata durumlarına checked yani kontroll ettiğim hatalar denir


            FileInputStream file = new FileInputStream("Liste.txt");

        // bu komut dosya okuma işlemini başlatır.


        dosyaAc();

    }

    public static void dosyaAc() throws FileNotFoundException {

        FileInputStream file = new FileInputStream("Liste.txt");
    }

}
