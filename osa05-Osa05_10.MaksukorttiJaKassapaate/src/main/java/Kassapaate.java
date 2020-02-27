
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if (maksu >= 2.5) {
            rahaa = rahaa + 2.5;
            double palautus = maksu - 2.5;
            edulliset++;
            return palautus;
        }
        if (maksu < 2.5) {
            return maksu;
        }
        return -1;
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if (maksu >= 4.3) {
            rahaa = rahaa + 4.3;
            double palautus = maksu - 4.3;
            maukkaat++;
            return palautus;
        }
        if (maksu < 4.3) {
            return maksu;
        }
        return -1;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        double saldo = kortti.saldo();
        if (saldo >= 2.5) {
            kortti.otaRahaa(2.5);
            edulliset++;
            return true;
        }
        if (saldo < 2.5) {
            return false;
        }
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        double saldo = kortti.saldo();
        if (saldo >= 4.3) {
            kortti.otaRahaa(4.3);
            maukkaat++;
            return true;
        }
        if (saldo < 4.3) {
            return false;
        }
        return false;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa >= 0) {
            kortti.lataaRahaa(summa);
            rahaa = rahaa + summa;
        }

    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
