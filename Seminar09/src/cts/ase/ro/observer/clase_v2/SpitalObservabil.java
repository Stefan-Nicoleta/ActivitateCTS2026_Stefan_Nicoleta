package cts.ase.ro.observer.clase_v2;

import java.util.ArrayList;
import java.util.List;

public abstract class SpitalObservabil {
    //-colectieObservatori: Observer
    private List<Pacient> lista = new ArrayList<>();

    public void abonarePacient(Pacient pacient){
        lista.add(pacient);
    }
    public void dezabonarePacient(Pacient pacient){
        lista.remove(pacient);
    }

    public void notificaPacienti(String mesaj){
        for(Pacient pacient:lista){
            pacient.notificarePacient(mesaj);
        }
    }
}
