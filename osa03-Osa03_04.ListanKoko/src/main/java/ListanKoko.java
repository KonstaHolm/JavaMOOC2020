
import java.util.ArrayList;
import java.util.Scanner;

public class ListanKoko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            luku++;

            lista.add(luettu);
        }
        
        System.out.println("Yhteensä: " + luku);

    }
}
