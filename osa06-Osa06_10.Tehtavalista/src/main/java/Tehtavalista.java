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

public class Tehtavalista {

    private ArrayList<String> tehtavat = new ArrayList<>();

    public Tehtavalista() {

    }

    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
    }

    public void tulosta() {
        for (int i = 0; i < tehtavat.size(); i++) {
            int o;
            o = i + 1;
            System.out.println(o + ": " + tehtavat.get(i));
        }
    }

    public void poista(int numero) {
        int mones = numero - 1;
        tehtavat.remove(mones);
    }

}
