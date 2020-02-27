
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double luku = 1;
        double lukujensumma = 0;
        int lukuja = 0;
        double keskiarvo = 0;

        while (luku != 0) {
            System.out.println("Syötä luku");
            luku = lukija.nextInt();
            if (luku > 0) {
                lukujensumma = lukujensumma + (luku);
                lukuja++;
                keskiarvo = lukujensumma / lukuja;
            }
        }
        if (lukuja == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
        if (lukuja != 0) {
            System.out.println(keskiarvo);
        }

    }
}
