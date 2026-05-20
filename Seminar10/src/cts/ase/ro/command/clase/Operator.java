package cts.ase.ro.command.clase;

import java.util.ArrayList;
import java.util.List;



//Invoker (ManagerComenzi)
public class Operator {
    private List<ICommand> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(ICommand command){
        listaComenzi.add(command);
    }

    public void executaComanda(){
        if(!listaComenzi.isEmpty()){
            listaComenzi.getFirst().pleacaInCursa();
            listaComenzi.removeFirst();
        }

    }


}
