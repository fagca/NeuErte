package Gun_36_1.paket_2;

import Gun_36_1.paket_1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h2 = new P1Hayvan();
        h2.ad = "köpek";

        P2Kedi kedi1 = new P2Kedi("kopuk","scotish");
        System.out.println("kedi1 = " + kedi1);
    }
}
