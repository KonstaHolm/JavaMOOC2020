
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        boolean loytyiko = false;
        String keta1 = "";
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                System.out.println("Ketä etsitään?");
                keta1 = lukija.nextLine();
                for(String henkilo : lista){
                    if(henkilo.equals(keta1)){
                        loytyiko = true;
                    }
                }       
                break;
            }
            lista.add(luettu);
        }
        
        if(loytyiko){
            System.out.println(keta1 + " löytyi!");
        } else {
            System.out.println(keta1 + " ei löytynyt!");
        }

    }
}
