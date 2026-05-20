package B8_Composite;

import java.util.ArrayList;
import java.util.List;

//CLasa Concreta
public class Meniu implements IMeniu{

    //-List<IComposite> lista
   private List<IMeniu> lista = new ArrayList<>();
   private String numeProdus;


    public Meniu(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    //+metodaSpecifica()
    @Override
    public void afisareOptiuni() {
        System.out.println(this.numeProdus);
        for (IMeniu iMeniu:lista){
            iMeniu.afisareOptiuni();
        }
    }

    public void adaugaNod(IMeniu iMeniu){
        lista.add(iMeniu);
    }

    public void stergeNod(IMeniu iMeniu){
        lista.remove(iMeniu);
    }

    public List<IMeniu> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meniu{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
