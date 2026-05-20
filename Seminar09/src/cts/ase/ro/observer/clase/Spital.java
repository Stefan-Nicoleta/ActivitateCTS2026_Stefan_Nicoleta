package cts.ase.ro.observer.clase;

import java.util.ArrayList;
import java.util.List;


//Observabilul
public class Spital implements ISpital{

    private String nume;
    //- colectieObservatori lista;
    private List<Pacient> listaPacienti = new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacient:listaPacienti){
            pacient.receptioneazaNotificare(mesaj);
        }
    }


    //+abonareObservator()
    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }


    //+dezabonareObservator()
    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }


    //+notificareObservator
    public void notificaVirus(){
        trimiteMesaj("Exista un virus in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie in oras!");
    }




}
