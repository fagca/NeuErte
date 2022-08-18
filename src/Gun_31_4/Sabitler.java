package Gun_31_4;

public class Sabitler {



    final static int birGundekiSaatSayisi = 24;
    final static int birSaattakiDakikaSayisi = 60;
    final static int birDakikadaSaniyeayisi = 60;


    public static int hesapla (int gun, int saat, int dakika)
    {
        int toplamSaniye = gun*birGundekiSaatSayisi*birDakikadaSaniyeayisi*birDakikadaSaniyeayisi+saat*birSaattakiDakikaSayisi*birDakikadaSaniyeayisi+dakika*birDakikadaSaniyeayisi;

        return toplamSaniye;
    }



}
