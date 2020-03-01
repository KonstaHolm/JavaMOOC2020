
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio tankki1 = new Sailio();
        Sailio tankki2 = new Sailio();

        while (true) {

            if (tankki1.sisalto() > 0) {
                System.out.println("Ensimmäinen: " + tankki1.toString());
            }
            if (tankki2.sisalto() > 0) {
                System.out.println("Toinen: " + tankki2.toString());
            }
            //System.out.println("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                System.out.println("Ensimmäinen: " + tankki1.toString());
                System.out.println("Toinen: " + tankki2.toString());
                break;
            }

            if (luettu.equals("lisaa")) {
                System.out.println("Paljonko?:");
                int paljonko = lukija.nextInt();
                tankki1.lisaa(paljonko);
            }

            if (luettu.equals("poista")) {
                System.out.println("Paljonko?:");
                int paljonko = lukija.nextInt();
                tankki1.poista(paljonko);
            }

            if (luettu.equals("siirra")) {
                System.out.println("Paljonko?:");
                int paljonko = lukija.nextInt();
                tankki1.poista(paljonko);
                tankki2.lisaa(paljonko);
            }

        }

    }
}
