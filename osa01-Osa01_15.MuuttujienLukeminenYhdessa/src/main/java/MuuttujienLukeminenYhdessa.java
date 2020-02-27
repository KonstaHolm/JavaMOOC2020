
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String arvo1 = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int arvo2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double arvo3 = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean arvo4 = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + arvo1);
        System.out.println("Syötit kokonaisluvun " + arvo2);
        System.out.println("Syötit liukuluvun " + arvo3);
        System.out.println("Syötit totuusarvon " + arvo4);
        

    }
}
