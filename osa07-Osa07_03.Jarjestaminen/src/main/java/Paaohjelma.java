
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i = 0; i < taulukko.length; ++i) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        // kirjoita koodia tähän
        int pienin = taulukko[0];
        int indeksi = 0;
        for (int i = 0; i < taulukko.length; ++i) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        // kirjoita koodia tähän
        int pienin = taulukko[aloitusIndeksi];
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; ++i) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;

    }

    public static void jarjesta(int[] taulukko) {
        /*int pienin = Paaohjelma.pienin(taulukko);
        int pieninIndeksi = Paaohjelma.pienimmanIndeksi(taulukko);
        for (int i = 0; i < taulukko.length; ++i) {
            if (taulukko[0] < pienin && pieninIndeksi != 0) {
                Paaohjelma.vaihda(taulukko, 0, pienin);
                System.out.println(taulukko);
            }
        }
        for (int i = 1; i < taulukko.length; ++i) {
            if (taulukko[i] < pienimmanIndeksiAlkaen(taulukko, i) ) {
                Paaohjelma.vaihda(taulukko, i, pienin);
                System.out.println(taulukko);
            }
        }
        */
        
        Arrays.sort(taulukko);

    }

}
