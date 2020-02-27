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

public class Huone {
    
    ArrayList<Henkilo> ihmiset = new ArrayList<>();
    
    public Huone(){
        
    }
    
    public void lisaa(Henkilo henkilo){
        ihmiset.add(henkilo);
    }
    
    public boolean onTyhja(){
        if(ihmiset.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Henkilo> getHenkilot(){
        return ihmiset;
    }
    
    public Henkilo lyhin(){
        Henkilo lyhin = ihmiset.get(0);
        int pituus = 0;
        if(!ihmiset.isEmpty()){
            for(Henkilo ihminen : ihmiset){
                if(ihminen.getPituus() < pituus){
                    pituus = ihminen.getPituus();
                    lyhin = ihminen;
                }
            }
        }
        /*if(ihmiset.isEmpty()){
            return null;
        }*/
        return lyhin;
    }
    
    public Henkilo ota(){
        int indeksi = 0;
        int apu = 0;
        Henkilo lyhin;
        int pituus = 9999;
        if(!ihmiset.isEmpty()){
            for(Henkilo ihminen : ihmiset){
                if(ihminen.getPituus() < pituus){
                    lyhin = ihminen;
                    pituus = ihminen.getPituus();
                    apu = indeksi;
                }
                indeksi++;
            }
        }
        if(ihmiset.isEmpty()){
            return null;
        }
        
        ihmiset.remove(apu);
        return ihmiset.get(0);
        
    }
    
    
}
