
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                int luku1 = lukija.nextInt();
                int luku2 = lukija.nextInt();
                for(int i=luku1;i<=luku2;i++){
                    System.out.println(luvut.get(i));
                }
                break;
            }

            luvut.add(luku);
        }
        
        

    }
}
