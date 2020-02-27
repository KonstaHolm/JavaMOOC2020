
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String tunnus = "j";
        String nimi = "j";
        ArrayList<String> esineet = new ArrayList<>();
        boolean onko = false;

        while (!tunnus.isEmpty() || !nimi.isEmpty()) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            tunnus = lukija.nextLine();
            if (tunnus.isEmpty()) {
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            String esine = tunnus + ": " + nimi;

            for (String item : esineet) {
                if (esine.equals(item)) {
                    onko = true;
                }
            }
            if (onko == false) {
                esineet.add(esine);
            }

        }
        for (String item : esineet) {
            System.out.println(item);
        }

    }
}
