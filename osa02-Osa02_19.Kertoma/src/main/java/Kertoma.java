
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 1;
        System.out.println("Anna luku:");
        int luku = lukija.nextInt();
        for (int i = 1; i <= luku; i++) {
            summa = summa * i;
        }
        System.out.println("Summa on " + summa);
        
    }
}
