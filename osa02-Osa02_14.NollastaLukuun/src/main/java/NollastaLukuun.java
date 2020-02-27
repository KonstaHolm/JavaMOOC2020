
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = lukija.nextInt();
        for(int i=0;i<=luku;i++){
            System.out.println(i);
        }
        
    }
}
