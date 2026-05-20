package cts.ase.ro.chain;

public class Troleibuz extends Handler{
    @Override
    public void setHandler(Handler handler) {
        super.setHandler(handler);
    }

    public String gestioneazaCerere(double distanta){
        if(distanta <3){
            return "Troleibuz";
        }
        else{
            return super.handler.gestioneazaCerere(distanta);
        }
    }
}
