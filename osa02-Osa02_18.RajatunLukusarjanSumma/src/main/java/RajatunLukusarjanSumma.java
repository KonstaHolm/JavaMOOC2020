
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        System.out.println("Ensimmäinen:");
        int luku = lukija.nextInt();
        System.out.println("Viimeinen:");
        int luku2 = lukija.nextInt();
        for (int i = luku; i <= luku2; i++) {
            summa = summa + i;
        }
        System.out.println("Summa on " + summa);
        
        
    }
}
