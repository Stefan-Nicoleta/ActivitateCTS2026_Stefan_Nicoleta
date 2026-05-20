package cts.ase.ro.chain;

public class Autobuz extends Handler{

    @Override
    public void setHandler(Handler handler) {
        super.setHandler(handler);
    }

    public String gestioneazaCerere(double distanta){
        if(distanta <5){
            return "Autobuz";
        }
        else{
            return super.handler.gestioneazaCerere(distanta);
        }
    }

}
