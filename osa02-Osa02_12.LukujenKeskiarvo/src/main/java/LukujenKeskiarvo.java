
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double luku = 1;
        double lukujensumma = 0;
        int lukuja = 0;
        double keskiarvo = 0;
        
        while(luku!=0){
            System.out.println("Syötä luku");
            luku = lukija.nextInt();
            if(luku != 0){
                lukujensumma = lukujensumma + (luku);
                lukuja++;
                keskiarvo = lukujensumma / lukuja;
            }
            System.out.println(keskiarvo);
        }

        System.out.println("Lukujen keskiarvo " + keskiarvo);
        
        
        
    }
}
