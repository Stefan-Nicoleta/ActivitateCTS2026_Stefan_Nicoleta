package A12_Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Spital {
    private List<IPacient> lista = new ArrayList<>();

    public void abonarePacienti(IPacient iPacient){
        lista.add(iPacient);
    }

    public void dezabonarePacient(IPacient iPacient){
        lista.remove(iPacient);
    }

    public void notificaPacient(String mesaj){
        for(IPacient iPacient:lista){
            iPacient.notificaPacienti(mesaj);
        }
    }
}
