package Gun_33_2;

public enum Aylar {

    OCAK (1,31,"Ocak"),
    SUBAT (2,31,"Şubat"),
    MART (3,31,"Mart"),
    NISAN (4,31,"Nisan"),
    MAYIS (5,31,"Mayıs"),
    HAZIRAN (6,31,"Haziran"),
    TEMMUZ (7,31,"Temmuz"),
    AGUSTOS (8,31,"Ağustos"),
    EYLUL (9,31,"Eylül"),
    EKIM (10,31,"Ekim"),
    KASIM (11,31,"Kasım"),
    ARALIK (12,31,"Aralık");



    final int ayNo;
    final int gunMiktar;
    final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }
}
