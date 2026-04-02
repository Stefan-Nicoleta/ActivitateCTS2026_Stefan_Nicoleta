package prototype;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta{
    int cantitati;
    String denumireMedicament;
    List<String> listaIngrediente;

    public Reteta(int cantitati, String denumireMedicament, List<String> listaIngrediente) {
        this.cantitati = cantitati;
        this.denumireMedicament = denumireMedicament;
        this.listaIngrediente = listaIngrediente;
    }

    Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitati=").append(cantitati);
        sb.append(", denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", listaIngrediente=").append(listaIngrediente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IReteta clone() {
        Reteta reteta = new Reteta();
        reteta.cantitati = this.cantitati;
        reteta.denumireMedicament = this.denumireMedicament;


        List<String> temp = new ArrayList<>();
        for(String lista : listaIngrediente){
            temp.add(lista);
        }

        reteta.listaIngrediente = temp;

        return reteta;
    }


}
