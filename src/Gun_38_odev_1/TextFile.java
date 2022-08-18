package Gun_38_odev_1;

public class TextFile extends Files implements IReadFile{
    public TextFile(String isim) {
        super(isim);
    }

    @Override
    public String open() {
        return "openning.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }


}
