
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }

            lista.add(luettu);
        }
        

        System.out.println("");
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        int pienin = 9999;
        ArrayList<Integer> indeksit = new ArrayList<>();
        for(int i = 0;i<=lista.size()-1;i++)
        {
            if(lista.get(i) < pienin){
                pienin = lista.get(i);
                indeksit.add(i);
                continue;
            }
        }
        System.out.println("Pienin luku on " + pienin);
        for(Integer luku : indeksit){
            System.out.println("Pienin luku löytyy indeksistä " + luku);
        }
        
    }
}
