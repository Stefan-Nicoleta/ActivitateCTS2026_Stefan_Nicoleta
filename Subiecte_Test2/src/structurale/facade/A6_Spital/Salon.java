package structurale.facade.A6_Spital;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere = new ArrayList<>();


    public Salon(List<Integer> paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public void ocuparePaturi(){
       this.paturiLibere.add(1);
    }

    public void elibereazaPaturi(){
        this.paturiLibere.remove(1);
    }
}
