/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holmk
 */
public class Maksukortti {

    private double saldo = 0;

    public Maksukortti(double alkusaldo) {
        saldo = alkusaldo;
    }

    public String toString() {
        return "Kortilla on rahaa " + saldo + " euroa";
    }

    public void syoEdullisesti() {
        // kirjoita koodia tähän
        if (saldo >= 2.60) {
            this.saldo = saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if (saldo >= 4.60) {
            this.saldo = saldo - 4.60;
        }
    }

    public void lataaRahaa(double rahamaara) {
        // kirjoita koodia tähän
        if (rahamaara >= 0) {
            saldo = saldo + rahamaara;
            if (saldo + rahamaara > 150) {
                saldo = 150;
            }
        }
    }

}
