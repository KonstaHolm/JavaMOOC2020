
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        int montako = 0;
        double summa = 0;
        int syote = 0;
        double keskiarvo = 0;
        double hyvaksytyt = 0;
        int montakoHyvaksyttya = 0;
        double hyvaksyttyjenKeskiarvo = 0;
        double hyvaksymisProsentti = 0;
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true) {
            syote = lukija.nextInt();
            if (syote != -1 && syote <= 100 && syote >= 0) {
                summa = summa + syote;
                montako++;
                if (syote >= 50) {
                    hyvaksytyt = hyvaksytyt + syote;
                    montakoHyvaksyttya++;
                }
            }
            if (syote == -1) {
                keskiarvo = summa / montako;
                hyvaksyttyjenKeskiarvo = hyvaksytyt / montakoHyvaksyttya;
                hyvaksymisProsentti = (100 * montakoHyvaksyttya) / montako;
                System.out.println("Pisteiden keskiarvo (kaikki): " + keskiarvo);
                if(montakoHyvaksyttya == 0){
                    System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
                }
                if(montakoHyvaksyttya > 0){
                    System.out.println("Pisteiden keskiarvo (hyväksytyt):" + hyvaksyttyjenKeskiarvo);
                }
                System.out.println("Hyväksymisprosentti: " + hyvaksymisProsentti);
                break;
            }
        }

    }
}
