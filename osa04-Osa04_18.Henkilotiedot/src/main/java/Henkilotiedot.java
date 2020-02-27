
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        String etunimi="j";
        String sukunimi="";
        String henkilotunnus="";
        while(!etunimi.equals("")){
            System.out.println("Etunimi: ");
            etunimi = lukija.nextLine();
            if(!etunimi.equals("")){
                System.out.println("Sukunimi: ");
                sukunimi = lukija.nextLine();
                System.out.println("Henkilötunnus: ");
                henkilotunnus = lukija.nextLine();
                Henkilotieto henkilo = new Henkilotieto(etunimi, sukunimi, henkilotunnus);
                henkilotiedot.add(henkilo);
            }
        }
        
        for(Object item : henkilotiedot){
            String esine = item.toString();
            String palat[] = esine.split(" ");
            String eka = palat[1];
            String toka = palat[0].substring(0, palat[0].length() -1);
            
            System.out.println(eka + " " + toka);
            
        }

    }
}
