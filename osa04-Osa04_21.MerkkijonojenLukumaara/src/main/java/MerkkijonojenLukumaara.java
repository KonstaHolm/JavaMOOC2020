
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String merkkijono = "";
        int lkm = 0;
        
        while(!merkkijono.equals("loppu")){
            merkkijono = lukija.nextLine();
            if(!merkkijono.equals("loppu")){
                lkm++;
            }
        }
        
        System.out.println(lkm);

    }
}
