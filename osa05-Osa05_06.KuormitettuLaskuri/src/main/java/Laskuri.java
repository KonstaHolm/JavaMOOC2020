/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Laskuri {
    private int alkuarvo;
    
    public Laskuri(int alkuarvo){
        this.alkuarvo = alkuarvo;
    }
    
    public Laskuri(){
        alkuarvo = 0;
    }
    
    public int arvo(){
        return alkuarvo;
    }
    
    public void lisaa(){
        alkuarvo++;
    }
    
    public void vahenna(){
        alkuarvo = alkuarvo - 1;
    }
    
    public void lisaa(int lisays){
        if(lisays >= 0){
            alkuarvo = alkuarvo + lisays;
        }
    }
    
    public void vahenna(int vahennys){
        if(vahennys >=0){
            alkuarvo = alkuarvo - vahennys;
        }
    }
    
}
