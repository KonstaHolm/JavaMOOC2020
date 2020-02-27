
import java.util.Scanner;

public class AlkioidenArvojenVaihtaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        int indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
        System.out.println("");

        // Toteuta indeksien kysyminen ja vaihto tänne
        
        System.out.println("Mitkä indeksit vaihdetaan?");
        int i1 = 0;
        int i2 = 0;
        i1 = lukija.nextInt();
        i2 = lukija.nextInt();
        int apu = taulukko[i1];
        taulukko[i1] = taulukko[i2];
        taulukko[i2] = apu;
        
        

        System.out.println("");
        indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
    }

}
