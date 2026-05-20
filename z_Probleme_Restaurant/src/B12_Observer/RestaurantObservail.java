package B12_Observer;


import java.util.ArrayList;
import java.util.List;

//Observabil
public abstract class RestaurantObservail {
    private List<IClient> lista = new ArrayList<>();

    public void abonareClientFidel(IClient iClient){
        lista.add(iClient);
    }

    public void dezabonareClientFidel(IClient iClient){
        lista.remove(iClient);
    }

    public void notificaClientFidel(String mesaj){
        for(IClient iClient:lista){
            iClient.notificaClientiFideli(mesaj);
        }
    }
}
