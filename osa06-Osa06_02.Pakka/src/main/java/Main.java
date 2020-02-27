
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Pakka p = new Pakka();
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        p.lisaa("Ar8vo");
        p.lisaa("Arvo62");
        p.lisaa("A7rvo");
        p.lisaa("Ar3vo");
        p.lisaa("Arv4o");
        p.lisaa("Arv5o");
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
    }
}
