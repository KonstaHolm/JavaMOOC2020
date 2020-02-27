
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        String esine = "j";
        while (!esine.equals("")) {
            System.out.print("Nimi: ");
            esine = lukija.nextLine();
            if (!esine.equals("")) {
                Esine item = new Esine(esine);
                esineet.add(item);
            }
        }
        
        for(Object item : esineet){
            System.out.println(item.toString());
        }

    }
}
