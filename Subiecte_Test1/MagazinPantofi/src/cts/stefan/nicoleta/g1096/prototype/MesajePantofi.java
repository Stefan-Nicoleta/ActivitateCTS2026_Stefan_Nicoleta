package cts.stefan.nicoleta.g1096.prototype;

import java.util.ArrayList;
import java.util.List;

public class MesajePantofi implements PrototypeMesaje{

    List<MesajePantofi> listaMesaje = new ArrayList<>();
    int nrCaractereMaxim;

    public MesajePantofi(List<MesajePantofi> listaMesaje, int nrCaractereMaxim) {
        this.listaMesaje = listaMesaje;
        this.nrCaractereMaxim = nrCaractereMaxim;
    }

    public MesajePantofi() {
    }



    @Override
    public PrototypeMesaje cloneaza() {
        MesajePantofi mesajePantofi = new MesajePantofi();
        mesajePantofi.listaMesaje = this.listaMesaje;
        mesajePantofi.nrCaractereMaxim = this.nrCaractereMaxim;

        return mesajePantofi;
    }

    //verificarea restriciei
    public void adaugaMesaj(){
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MesajePantofi{");
        sb.append("listaMesaje=").append(listaMesaje);
        sb.append(", nrCaractereMaxim=").append(nrCaractereMaxim);
        sb.append('}');
        return sb.toString();
    }
}
