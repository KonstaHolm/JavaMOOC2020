
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String merkkijono = "ju";
        int vanhin = 0;
        String nimi = "";
        while(!merkkijono.equals("")){
            merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split(",");
            for (int i = 1; i < palat.length; i++) {
                    if (Integer.valueOf(palat[1]) > vanhin) {
                        vanhin = Integer.valueOf(palat[1]);
                        nimi = palat[1-1];
                    }
                }
            
        }
        System.out.println("Vanhimman nimi: " + nimi);

    }
}
