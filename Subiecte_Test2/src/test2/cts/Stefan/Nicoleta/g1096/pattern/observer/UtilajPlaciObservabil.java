package test2.cts.Stefan.Nicoleta.g1096.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UtilajPlaciObservabil {
    private List<Departament> lista = new ArrayList<>();


    public void abonareDepartament(Departament departament){
        lista.add(departament);
    }

    public void dezabonareDepartament(Departament departament){
        lista.remove(departament);
    }

    public void notificaDepartament(String mesaj){
        for(Departament departament:lista){
            departament.notificaDepartament(mesaj);
        }
    }
}
