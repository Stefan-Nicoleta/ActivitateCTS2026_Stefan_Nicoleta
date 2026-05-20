package B10_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String ,IRezervare> map = new HashMap<>();

    public IRezervare getDetaliiClient(String numeClient, int nrTelefon, String email){
        if(!map.containsKey(numeClient)){
            IRezervare iRezervare = new Client(numeClient,nrTelefon,email);
            System.out.println("Client nou");
            map.put(numeClient,iRezervare);
        }
        return map.get(numeClient);
    }
}
