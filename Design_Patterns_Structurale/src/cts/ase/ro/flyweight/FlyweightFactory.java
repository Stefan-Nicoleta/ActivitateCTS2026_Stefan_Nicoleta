package cts.ase.ro.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,IRezervare> map = new HashMap<>();

    public IRezervare getDateClient(String nume, String nrTelefon, String adresaEmail){
       if(!map.containsKey(nume)){
           IRezervare clientNou = new Client(nume, nrTelefon,adresaEmail);
           System.out.println("Obiect nou");
           map.put(nume,clientNou);
       }
       return map.get(nume);
    }
}
