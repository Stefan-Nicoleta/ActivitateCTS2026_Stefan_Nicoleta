package cts.ase.ro.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Departamente implements IComposite {

    private String numeDepartament;
    //List<ComponentaAbstracta> !
    private List<IComposite> subDepartamente = new ArrayList<>();

    public Departamente(String numeDepartament) {
        this.numeDepartament = numeDepartament;

    }


    //+metodaSPecifica()
    @Override
    public void afiseazaDetalii() {
        System.out.println("Nume dep: "+this.numeDepartament);
    for (IComposite iComposite : subDepartamente){
        iComposite.afiseazaDetalii();
    }
    }

    //+adaugaNod();
    public void adaugaNod(IComposite iComposite){
        subDepartamente.add(iComposite);
    }

    //+stergeNod();
    public void stergeNod(IComposite iComposite){
        subDepartamente.remove(iComposite);
    }

    //+getNodCopii(); (getter)
    public List<IComposite> getSubDepartamente() {
        return subDepartamente;
    }
}
