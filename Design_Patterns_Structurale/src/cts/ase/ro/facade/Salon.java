package cts.ase.ro.facade;

import java.util.ArrayList;
import java.util.List;

//Clasa Concreta C
public class Salon {
    private List<String> paturiLibere = new ArrayList();

    public int getPatLiber(){
        for(int i=0; i<paturiLibere.size();i++){
            if(!this.paturiLibere.get(i).isEmpty()){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){

    }

}
