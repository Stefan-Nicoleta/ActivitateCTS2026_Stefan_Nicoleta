package cts.ase.ro.chain.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distantaParcursa) {
        if(distantaParcursa<3){
            return "Troliebuz";
        }
        else{return super.calatorieHandler.recomandaCalatorie(distantaParcursa);}
    }
}
