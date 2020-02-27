
public class Kasvatuslaitos {
    private int lkm = 0;

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        int paino = henkilo.getPaino();
        lkm++;
        return paino;
    }
    
    public void syota(Henkilo henkilo){
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset(){
        return lkm;
    }

}
