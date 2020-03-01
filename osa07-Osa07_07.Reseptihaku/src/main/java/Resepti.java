/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
import java.util.*;

public class Resepti {
    
    public final String nimi;
    public final int keittoaika;
    private final ArrayList<String> raakaAineet;
    
    public Resepti(String nimi, int keittoaika, ArrayList<String> raakaAineet){
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.raakaAineet = new ArrayList<>();
        this.raakaAineet.addAll(raakaAineet);
        
    }
    
}
