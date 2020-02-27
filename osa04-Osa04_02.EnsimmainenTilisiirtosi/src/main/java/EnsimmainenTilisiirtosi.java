
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili Matintili = new Tili("Matin tili", 1000);
        Tili Omatili = new Tili("Oma tili", 0);
        Matintili.otto(100.0);
        Omatili.pano(100.0);
        System.out.println(Matintili);
        System.out.println(Omatili);
        
        
    }
}
