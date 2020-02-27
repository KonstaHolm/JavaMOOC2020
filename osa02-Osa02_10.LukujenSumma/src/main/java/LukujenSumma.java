
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = 1;
        int lukujensumma = 0;
        
        while(luku!=0){
            System.out.println("Syötä luku");
            luku = lukija.nextInt();
            if(luku != 0){
                lukujensumma = lukujensumma + luku;
            }
        }
        System.out.println("Lukujen summa " + lukujensumma);
        
        
        
    }
}
