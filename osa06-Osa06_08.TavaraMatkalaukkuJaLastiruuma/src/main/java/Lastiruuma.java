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

public class Lastiruuma {

    private ArrayList<Matkalaukku> kamat = new ArrayList<>();
    private int max = 0;
    private int montako = 0;
    private int paino = 0;

    public Lastiruuma(int maxpaino) {
        max = maxpaino;
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (paino + laukku.yhteispaino() <= max) {
            kamat.add(laukku);
            paino = laukku.yhteispaino();
            montako++;
        }
    }

    public String toString() {
        if (montako > 1) {
            return montako + " matkalaukkua " + "(" + paino + " kg)";
        }
        if (montako == 1) {
            return montako + "matkalaukku " + "(" + paino + " kg)";
        }
        return "ei matkalaukkuja";
    }
    
    public void tulostaTavarat(){
        for(Matkalaukku laukku : kamat){
            laukku.tulostaTavarat();
        }
    }

}
