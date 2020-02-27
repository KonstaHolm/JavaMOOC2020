
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String merkkijono = "ju";
        int vanhin = 0;
        while(!merkkijono.equals("")){
            merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split(",");
            for (int i = 1; i < palat.length; i++) {
                    if (Integer.valueOf(palat[1]) > vanhin) {
                        vanhin = Integer.valueOf(palat[1]);
                    }
                }
            
        }
        System.out.println("Vanhimman ikä: " + vanhin);
        
        
    }
}
