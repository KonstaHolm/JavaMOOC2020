
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        boolean loytyyko = false;

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
         try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {

                String rivi = tiedostonLukija.nextLine();
                if(rivi.equals(etsittava)){
                    loytyyko = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
         
         if(loytyyko){
             System.out.println("Löytyi!");
         } else {
             System.out.println("Ei löytynyt.");
         }

    }
}
