
public class Lukutilasto {
    private int lukuja = 0;
    private int summa = 0;
    
    public Lukutilasto(){
        
    }
    
    public void lisaaLuku(int luku){
        lukuja++;
        summa += luku;
    }
    
    public int haeLukujenMaara(){
        return lukuja;
    }
    
    public double keskiarvo(){
        double keskiarvo = 0;
        if(lukuja == 0){
            return 0;
        }
        keskiarvo = (double)summa / lukuja;
        return keskiarvo;
    }
    
    public int summa(){
        return summa;
    }
    
}
