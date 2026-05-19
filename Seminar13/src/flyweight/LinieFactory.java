package flyweight;

import java.util.HashMap;
import java.util.Map;

//FlyweightFactory
public class LinieFactory {
    //-colectieFlyweight: Flyweight
    private Map<Integer, LinieDeTransport> linie = new HashMap<>();
   //+getObiectFlyweight(cheie): Flyweight
    public LinieDeTransport getLinie(int nrLinie,String primaLinie,String ultimaLinie) {
        if(this.linie.containsKey(nrLinie)) {
            return this.linie.get(nrLinie);
        }
        LinieDeTransport linieNoua = new Linie(nrLinie,primaLinie,ultimaLinie);
        this.linie.put(nrLinie,linieNoua);
        return linieNoua;
    }
}
