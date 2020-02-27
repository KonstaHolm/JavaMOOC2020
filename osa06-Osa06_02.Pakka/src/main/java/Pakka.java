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

public class Pakka {
    
    ArrayList<String> kortit = new ArrayList<>();
    
    
    public boolean onTyhja(){
        if(kortit.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void lisaa(String arvo){
        kortit.add(arvo);
    }
    
    public ArrayList<String> arvot(){
        return kortit;
    }
    
    public String ota(){
        String vika = kortit.get(kortit.size() - 1);
        kortit.remove(kortit.size() - 1);
        return vika;
    }
    
}
