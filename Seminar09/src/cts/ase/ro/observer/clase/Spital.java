package cts.ase.ro.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{

    private String nume;
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

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie in oras!");
    }




}
