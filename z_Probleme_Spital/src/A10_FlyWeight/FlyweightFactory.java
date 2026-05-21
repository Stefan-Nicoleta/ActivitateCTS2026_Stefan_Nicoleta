package A10_FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,IPacient> map = new HashMap<>();
    public IPacient getDetaliiPacient(String nume, int nrTelefon){
        if(!map.containsKey(nume)){
            IPacient iPacient = new Pacient(nume, nrTelefon);
            map.put(nume,iPacient);
            System.out.println("Client nou");
        }
        return map.get(nume);

    }
}
