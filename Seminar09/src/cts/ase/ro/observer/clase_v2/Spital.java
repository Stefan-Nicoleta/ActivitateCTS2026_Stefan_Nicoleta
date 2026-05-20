package cts.ase.ro.observer.clase_v2;

public class Spital extends SpitalObservabil{
    public void noitifcaVirus(){
        super.notificaPacienti("Virus");
    }

    public void notificaEpidemie(){
        super.notificaPacienti("Epidemie");
    }
}
