
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        
        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        double summa = luku1 + luku2;
        double lkm = 2;
        double keskiarvo = summa / lkm;
        System.out.println("Syötettyjen lukujen keskiarvo on " + keskiarvo);

    }
}
