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
public class Kayttoliittyma {
    private Tehtavalista lista;
    private Scanner skanneri;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner skanneri){
        this.lista = lista;
        this.skanneri = skanneri;
    }
    
    public void kaynnista(){
        String komento;
        while(true){
            System.out.println("Komento:");
            komento = skanneri.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
            if(komento.equals("lisaa")){
                System.out.println("Lisättävä:");
                String tehtava = skanneri.nextLine();
                lista.lisaa(tehtava);
            }
            if(komento.equals("poista")){
                System.out.println("Mikä poistetaan?");
                int poistettava = skanneri.nextInt();
                lista.poista(poistettava);
            }
            if(komento.equals("listaa")){
                lista.tulosta();
            }
            
            
        }
    }
    
    
}
