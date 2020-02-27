
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String merkkijono = "ju";
        while(!merkkijono.equals("")){
            merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split(" ");
            System.out.println(palat[0]);
        }
        

    }
}
