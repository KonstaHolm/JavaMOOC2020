/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Lahja {
    
    private String nimi;
    private int paino;
    
    public Lahja(String name, int weight){
        this.nimi = name;
        this.paino = weight;
    }
    
    public String getNimi(){
        return nimi;
    }
    
    public int getPaino(){
        return paino;
    }
    
    @Override
    public String toString(){
        return nimi + "(" + paino + " kg)";
    }
    
}
