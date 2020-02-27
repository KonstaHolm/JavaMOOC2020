
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    public String pisin(){
        String pisin = "";
        if(!alkiot.isEmpty()){
            for(String alkio : alkiot){
                if (alkio.length() > pisin.length()){
                    pisin = alkio;
                }
            }
        }
        if(alkiot.isEmpty()){
            pisin = null;
        }
        return pisin;
    }

}
