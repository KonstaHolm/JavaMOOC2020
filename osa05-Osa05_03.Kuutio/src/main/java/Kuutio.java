/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Kuutio {
    private int sarma;
    private int tilavuus;
    
    public Kuutio(int sarmanPituus){
        sarma = sarmanPituus;
        tilavuus = sarma * sarma * sarma;
    }
    
    public int tilavuus(){
        return tilavuus;
    }
    
    public String toString(){
        return "Kuution särmän pituus on " + sarma + ", tilavuus on " + tilavuus;
    }
    
    
}
