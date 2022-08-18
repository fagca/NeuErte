package Gun29_2;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }


    public String toString()
    {
        return name +" "+publishYear+" "+author;
    }








}
