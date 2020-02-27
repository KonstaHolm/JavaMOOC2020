/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
import java.util.ArrayList;

public class Pakkaus {
    
    private ArrayList<Lahja> pakkaus = new ArrayList<>();
    
    public void lisaaLahja(Lahja lahja){
        pakkaus.add(lahja);
    }
    
    public int yhteispaino(){
        int paino = 0;
        for(Lahja lahja : pakkaus){
            paino = paino + lahja.getPaino();
        }
        return paino;
    }
    
    
    
    
}
