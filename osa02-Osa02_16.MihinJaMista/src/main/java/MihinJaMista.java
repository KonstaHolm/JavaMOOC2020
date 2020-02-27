
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int luku = lukija.nextInt();
        System.out.println("Mistä lähtien?");
        int luku2 = lukija.nextInt();
        for (int i = luku2; i <= luku; i++) {
            System.out.println(i);
        }

    }
}
