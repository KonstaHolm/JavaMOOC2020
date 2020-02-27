
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();

        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            boolean onko = false;
            if (nimi.isEmpty()) {
                break;
            }

            System.out.println("Syötä kirjan julkaisuvuosi.");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, julkaisuvuosi);
            for(Kirja book : kirjat){
                if(book.getJulkaisuvuosi() == julkaisuvuosi && book.getNimi().equals(nimi)){
                    System.out.println("Kirja on jo listalla. Ei lisätä samaa kirjaa uudestaan.");
                    onko = true;
                    break;
                }
                
            }
            if(onko == false){
                kirjat.add(kirja);
            }

        }
        
        // Huom! Älä muuta tätä tulostusta!
        System.out.println("Kiitos! Kirjoja lisätty: " + kirjat.size());
    }
}
