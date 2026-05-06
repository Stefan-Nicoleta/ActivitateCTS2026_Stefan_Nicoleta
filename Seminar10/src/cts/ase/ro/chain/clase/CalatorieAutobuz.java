package cts.ase.ro.chain.clase;

public class CalatorieAutobuz extends CalatorieHandler{

    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distantaParcursa) {
        if(distantaParcursa<5){
            return "Autobuz";
        }
        else{return super.calatorieHandler.recomandaCalatorie(distantaParcursa);}
    }
}
