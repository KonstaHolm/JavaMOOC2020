
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = 1;
        int lukuja = 0;
        
        while(luku!=0){
            System.out.println("Syötä luku");
            luku = lukija.nextInt();
            if(luku < 0){
                lukuja++;
            }
        }
        System.out.println("Negatiivisia lukuja yhteensä " + lukuja);
        
        
        
    }
}
