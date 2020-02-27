
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
        
        int summa = 0;
        int lukuja = 0;
        float keskiarvo = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if(luettu != -1){
                summa += luettu;
                lukuja++;
            }
            if (luettu == -1) {
                keskiarvo = (float)summa / lukuja;
                System.out.println("Keskiarvo: " + keskiarvo);
                break;
            }

            lista.add(luettu);
        }
        
    }
}
