
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String merkkijono = "ju";
        while(!merkkijono.equals("")){
            merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split(" ");
            for(String sana : palat){
                System.out.println(sana);
            }
        }

    }
}
