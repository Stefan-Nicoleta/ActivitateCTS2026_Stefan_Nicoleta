package cts.ase.ro.chain.clase;

public class CalatorieTramvai extends CalatorieHandler{

    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distantaParcursa) {
        if(distantaParcursa<10){
            return "Tramvai";
        }
        else{return super.calatorieHandler.recomandaCalatorie(distantaParcursa);}
    }
}
