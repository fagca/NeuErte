package Gun_36_1.paket_2;

import Gun_36_1.paket_1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi = cinsi;
    }

    @Override
    public String toString() {
        return "P2Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
