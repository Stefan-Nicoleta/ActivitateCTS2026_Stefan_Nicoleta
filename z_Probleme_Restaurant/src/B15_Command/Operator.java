package B15_Command;


import java.util.ArrayList;
import java.util.List;

//Invoker
public class Operator {
    private List<IComanda> lista = new ArrayList<>();



    public void adaugaComanda(IComanda iComanda){
        lista.add(iComanda);
    }


    public void executaComanda(){
        if(!lista.isEmpty()){
            lista.getFirst().executa();
            lista.removeFirst();
        }
    }

}
