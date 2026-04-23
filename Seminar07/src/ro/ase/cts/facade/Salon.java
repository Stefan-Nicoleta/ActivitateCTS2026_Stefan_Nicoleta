package ro.ase.cts.facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private boolean[] paturiLibere = new boolean[10];

    public Salon() {
        this.paturiLibere[1] = true;
        this.paturiLibere[2] = true;
        this.paturiLibere[3] = true;
        this.paturiLibere[4] = true;
    }

    public int getPatLiber(){
        for (int i = 0; i < this.paturiLibere.length; i++) {
            if(this.paturiLibere[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i] = false;
    }


}
