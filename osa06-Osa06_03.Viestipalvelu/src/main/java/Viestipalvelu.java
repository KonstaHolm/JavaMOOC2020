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

public class Viestipalvelu {
    
    ArrayList<Viesti> viestit = new ArrayList<>();
    
    public Viestipalvelu(){
        
    }
    
    public void lisaa(Viesti viesti){
        String msg = viesti.getSisalto();
        if(msg.length() <= 280){
            viestit.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit(){
        return viestit;
    }
    
    
    
    
    
    
    
    
    
    
}
