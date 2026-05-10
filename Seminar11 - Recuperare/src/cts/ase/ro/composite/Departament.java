package cts.ase.ro.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDep;
    private List<Structura> subStructuri;

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Nume departament: " + this.numeDep);
        System.out.println("Subdepartamente:");
        for (Structura structura : subStructuri) {
            structura.afiseazaDetaliiStructura(spatii + "   ");
        }
    }

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructua(Structura structura) {
        subStructuri.add(structura);
    }

    public  void stergeStructura(Structura structura) {
        subStructuri.remove(structura);
    }

    public Structura getStructura(int index) {
        return subStructuri.get(index);
    }
}