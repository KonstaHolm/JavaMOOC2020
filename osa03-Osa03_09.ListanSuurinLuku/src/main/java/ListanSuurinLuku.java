
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int luku = 0;
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if(luettu > luku){
                luku = luettu;
            }
            if (luettu == -1) {
                System.out.println("Listan suurin luku:" + luku);
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");
        
        

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
