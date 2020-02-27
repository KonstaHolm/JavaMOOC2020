
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        
        Maksukortti Pekankortti = new Maksukortti(20.0);
        Maksukortti Matinkortti = new Maksukortti(30.0);
        
        Pekankortti.syoMaukkaasti();
        Matinkortti.syoEdullisesti();
        
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());
        
        Pekankortti.lataaRahaa(20.0);
        Matinkortti.syoMaukkaasti();
        
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());
        
        Pekankortti.syoEdullisesti();
        Pekankortti.syoEdullisesti();
        
        Matinkortti.lataaRahaa(50);
        
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());

    }
}
