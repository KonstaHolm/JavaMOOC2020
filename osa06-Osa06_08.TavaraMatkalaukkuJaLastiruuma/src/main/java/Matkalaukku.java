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

public class Matkalaukku {
    
    private ArrayList<Tavara> kamat = new ArrayList<>();
    private int yhtmaxpaino = 0;
    private int kamoja = 0;
    private int paino = 0;
    
    public Matkalaukku(int maxpaino){
        yhtmaxpaino = maxpaino;
    }
    
    public void lisaaTavara(Tavara tavara){
        if(paino + tavara.getPaino() <= yhtmaxpaino){
            kamat.add(tavara);
            kamoja++;
        }
    }
    
    @Override
    public String toString(){
        int paino = 0;
        for(Tavara item : kamat){
            paino = paino + item.getPaino();
        }
        if(kamat.size() > 1){
            return kamoja + " tavaraa " + "(" + paino + " kg)";
        }
        if(kamat.size() == 1){
            return kamoja + " tavara " + "(" + paino + " kg)";
        }
            return "ei tavaroita (0 kg)";
    }
    
    public void tulostaTavarat(){
        for(Tavara item : kamat){
            System.out.println(item);
        }
    }
    
    public int yhteispaino(){
        int paino = 0;
        for(Tavara item : kamat){
            paino = paino + item.getPaino();
        }
        return paino;
    }
    
    public Tavara raskainTavara(){
        Tavara haettu = kamat.get(0);
        int paino = 0;
        for(Tavara item : kamat){
            if(item.getPaino() > paino){
                haettu = item;
                paino = item.getPaino();
            }
        }
        if(kamat.isEmpty()){
            return null;
        }
        return haettu;
    }
    
}
