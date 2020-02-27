
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku1 = 1;
        
        while(luku1!=0){
            System.out.println("Syötä luku");
            luku1 = lukija.nextInt();
            if(luku1 < 0) {
                System.out.println("Epäkelpo luku");
                continue;
            }
            if(luku1 > 0) {
                System.out.println(luku1 * luku1);
                continue;
            }
        }
        
    }
}
