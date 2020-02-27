
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        String merkkijono = "";
        int luku = 0;
        
        while(!merkkijono.equals("loppu")){
            merkkijono = lukija.nextLine();
            if(!merkkijono.equals("loppu")){
                luku = Integer.valueOf(merkkijono);
                System.out.println(luku * luku * luku);
            }
        }
        
    }
}
