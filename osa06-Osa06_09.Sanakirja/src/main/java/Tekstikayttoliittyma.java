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

public class Tekstikayttoliittyma {

    private Scanner skanneri;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner skanneri, Sanakirja kirja) {
        this.skanneri = skanneri;
        this.sanakirja = kirja;
    }

    public void kaynnista() {
        String komento;
        do {
            System.out.println("Komento:");
            komento = skanneri.nextLine();
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            }
            if(komento.equals("lisaa")){
                System.out.println("Sana:");
                String sana = skanneri.nextLine();
                System.out.println("Käännös:");
                String kaannos = skanneri.nextLine();
                sanakirja.lisaa(sana, kaannos);
                continue;
            }
            if(komento.equals("hae")){
                System.out.println("Haettava:");
                String haettava = skanneri.nextLine();
                if(sanakirja.kaanna(haettava) == null){
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else {
                    System.out.println(sanakirja.kaanna(haettava));
                }
            }
            
            
            System.out.println("Tuntematon komento");
        } while(!komento.equals("lopeta"));
    }

}
