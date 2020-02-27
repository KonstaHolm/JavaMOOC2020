
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {

                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split(",");

                if (Integer.valueOf(palat[1]) > 1 || Integer.valueOf(palat[1]) == 0) {
                    System.out.println(palat[0] + ", " + "ikä: " + palat[1] + " vuotta");
                } else {
                    System.out.println(palat[0] + ", " + "ikä: " + palat[1] + " vuosi");
                }

            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
