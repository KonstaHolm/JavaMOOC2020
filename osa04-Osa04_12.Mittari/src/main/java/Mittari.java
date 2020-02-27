/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Mittari {
    
    private int mitta;
    
    public Mittari(){
        mitta = 0;
    }
    
    public void lisaa(){
        if(mitta < 5){
            mitta += 1;
        }
    }
    
    public void vahenna(){
        if(mitta > 0){
            mitta += -1;
        }
    }
    
    public int mitta(){
        return mitta;
    }
    
    public boolean taynna(){
        if(mitta == 5){
            return true;
        }
        else {
            return false;
        }
    }
    
}
