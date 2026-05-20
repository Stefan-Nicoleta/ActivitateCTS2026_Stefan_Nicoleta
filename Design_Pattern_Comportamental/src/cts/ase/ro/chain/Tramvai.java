package cts.ase.ro.chain;

public class Tramvai extends Handler{

    @Override
    public void setHandler(Handler handler) {
        super.setHandler(handler);
    }

    public String gestioneazaCerere(double distanta){
        if(distanta <10){
            return "Tramvai";
        }
        else{
            return super.handler.gestioneazaCerere(distanta);
        }
    }
}
