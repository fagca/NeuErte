package Gun29_2;

public class Kitapci {
    public static void main(String[] args) {
        //kitapların özelliklerini tek bir satırda yazdıran bir method ekleyiniz
        //3 adet farklı consturcto ile main de yazdırınız
        
        
        Book kitap = new Book("Fareler ve İnsanlar", 1997,"John Steinback");

        System.out.println("kitap.name+\" \"+ kitap.publishYear+\" \"+kitap.publishYear = " + kitap.name+" "+ kitap.publishYear+" "+kitap.publishYear);


        System.out.println("kitap = " + kitap);

        String ana = kitap.toString();
        System.out.println("ana = " + ana);

    }
}
