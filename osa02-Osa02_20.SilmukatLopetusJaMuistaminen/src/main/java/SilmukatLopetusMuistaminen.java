
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luvut:");
        int i = 0;
        int s = 0;
        int l = 0;
        int paril = 0;
        int parit = 0;
        while (i != -1) {
            i = lukija.nextInt();
            if (i != -1) {
                s = s + i;
                l++;
                if (i % 2 == 0) {
                    paril++;
                }
                if (i % 2 != 0) {
                    parit++;
                }
            }

        }

        double k = ((double) s) / ((double) l);

        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + s);
        System.out.println("Lukuja: " + l);
        System.out.println("Keskiarvo: " + k);
        System.out.println("Parillisia: " + paril);
        System.out.println("Parittomia: " + parit);

    }
}
