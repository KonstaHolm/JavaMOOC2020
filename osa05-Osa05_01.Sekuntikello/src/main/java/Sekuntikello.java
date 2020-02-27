/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Sekuntikello {

    private int sekunnit;
    private int sadasosasekunnit;

    public Sekuntikello() {
        Viisari sekuntti = new Viisari(60);
        Viisari sataSekuntti = new Viisari(100);
        sekunnit = 0;
        sadasosasekunnit = 0;
    }

    public void etene() {
        sadasosasekunnit = sadasosasekunnit + 1;
        if (sadasosasekunnit == 100) {
            sekunnit++;
            sadasosasekunnit = 0;
            if(sekunnit == 60){
                sekunnit = 0;
            }
        }
    }

    public String toString() {
        if (sekunnit < 10) {
            if (sadasosasekunnit < 10) {
                return "0" + sekunnit + ":" + "0" + sadasosasekunnit;
            }
            return "0" + sekunnit + ":" + sadasosasekunnit;
        }
        return sekunnit + ":" + sadasosasekunnit;
    }

}
