
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava){
        Raha massi = new Raha(this.euroa + 1, this.senttia);
        return massi;
    }
    
    public boolean vahemman(Raha verrattava){
        if(this.euroa < verrattava.eurot()){
            return true;
        }
        if(this.euroa == verrattava.eurot()){
            if(this.senttia < verrattava.sentit()){
                return true;
            }  
        }
        return false;
    }
    
    public Raha miinus(Raha vahentaja){
        Raha massi = new Raha(this.euroa, this.senttia);
        int eka = massi.eurot();
        int toka = massi.sentit();
        toka = toka - vahentaja.sentit();
        if(toka < 0){
            int apu = vahentaja.sentit() - toka;
            eka = eka - 1;
            toka = 100 - apu;
        }
        eka = eka - vahentaja.eurot();
        if(eka < 0){
            eka = 0;
        }
        return massi;
    }
    

}
