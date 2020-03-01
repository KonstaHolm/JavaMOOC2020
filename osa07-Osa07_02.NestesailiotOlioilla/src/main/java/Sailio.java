/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Sailio {
    
    private int sailio = 0;
    
    public Sailio(){
        
    }
    
    public void lisaa(int maara){
        if(maara >= 0 && (sailio + maara <= 100) ){
            sailio += maara;
        }
        if(maara >= 0 && (sailio + maara > 100) ){
            sailio = 100;
        }
        
    }
    
    public int sisalto(){
        return sailio;
    }
    
    public void poista(int maara){
        if(maara >= 0 && (sailio - maara >= 0) ){
            sailio = sailio - maara;
        }
        if(maara >= 0 && (sailio - maara < 0) ){
            sailio = 0;
        }
    }
    
    @Override
    public String toString(){
        return sailio + "/100";
    }
    
}
