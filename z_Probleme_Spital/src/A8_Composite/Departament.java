package A8_Composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartamente {

    private List<IDepartamente> lista = new ArrayList<>();
    private String numeDepartament;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    public void adaugaNod(IDepartamente iDepartamente){
        lista.add(iDepartamente);
    }

    public void stergeNod(IDepartamente iDepartamente){
        lista.remove(iDepartamente);
    }

    public List<IDepartamente> getLista() {
        return lista;
    }



    @Override
    public void afiseazaSectii() {
        System.out.println("Nume departament: "+this.numeDepartament);
        for(IDepartamente iDepartamente: lista){
            iDepartamente.afiseazaSectii();
        }
    }
}
