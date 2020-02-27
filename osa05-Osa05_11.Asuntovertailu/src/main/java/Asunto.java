
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava){
        if(verrattava.koko() < this.koko()){
            return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava){
        if(this.hinta() > verrattava.hinta()){
            return (this.hinta() - verrattava.hinta());
        }
        else {
            return (verrattava.hinta() - this.hinta());
        }
    }
    
    public boolean kalliimpi(Asunto verrattava){
        if(verrattava.hinta() < this.hinta()){
            return true;
        }
        return false;
    }
    
    public int koko(){
        return nelioita;
    }
    
    public int hinta(){
        return neliohinta * nelioita;
    }

}
