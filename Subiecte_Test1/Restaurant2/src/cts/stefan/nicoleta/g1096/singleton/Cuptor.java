package cts.stefan.nicoleta.g1096.singleton;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    //Singleton

    String modelCuptor;
    int versiune;
    List<String> listaAsteptare = new ArrayList<>();




    private static Cuptor instanta = null;

    private Cuptor() {

    }

    public void detaliiCuptor(){
        System.out.println("Cuptorul "+this.modelCuptor+" are versiunea "+this.versiune);

    }

    public void adaugaInLista(String preparat, int timpAlocat, int grade){
        listaAsteptare.add(preparat + " "+timpAlocat+ " "+grade);
    }

    public void afiseazaLista(){
        System.out.println("Comenzi "+listaAsteptare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("modelCuptor='").append(modelCuptor).append('\'');
        sb.append(", versiune=").append(versiune);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Cuptor getInstance(){
        if(instanta == null){
            instanta = new Cuptor();
        }
        return instanta;
    }
}
