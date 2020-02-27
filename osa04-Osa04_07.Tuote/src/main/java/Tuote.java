/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Tuote {
    
    private double hinta;
    private int lukumaara;
    private String nimi;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        hinta = hintaAlussa;
        lukumaara = maaraAlussa;
        nimi = nimiAlussa;
    }

    public void tulostaTuote(){
        System.out.println(nimi + ", hinta" + hinta + ", " + lukumaara + " kpl");
    }
}
