package cts.ase.ro.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> listaComenzi = new ArrayList<>();

    public void inregistreaza(IComanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaFisa(){
      if(!listaComenzi.isEmpty()){
          listaComenzi.getFirst().executa();
          listaComenzi.removeFirst();
      }




    }
}
