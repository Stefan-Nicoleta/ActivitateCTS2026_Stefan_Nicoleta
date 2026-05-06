package cts.ase.ro.chain.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler calatorieHandler;

    public CalatorieHandler() {
        this.calatorieHandler = null;
    }

    //obligatoriu setter
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        this.calatorieHandler = calatorieHandler;
    }

    public String recomandaCalatorie(double distantaParcursa){
        return null;
    }


}
