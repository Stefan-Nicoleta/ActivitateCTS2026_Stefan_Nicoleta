package cts.stefan.nicoleta.g1096.prototype;

import cts.stefan.nicoleta.g1096.simplefactory.Bautura;

import java.util.HashMap;
import java.util.Map;

public class BauturaPresetata {
    private Map<String, Bautura> colectieBautura = new HashMap<>();

    public void adaugaBauturaPresetata(String cheie, Bautura valoare){
        colectieBautura.put(cheie,valoare);
    }

    public Bautura getBautura(String cheie){
        try{
            Bautura bauturaPersonalizata = colectieBautura.get(cheie);

            if(bauturaPersonalizata!=null){
                return (Bautura) bauturaPersonalizata.clone();
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
