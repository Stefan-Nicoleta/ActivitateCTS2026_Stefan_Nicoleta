package cts.ase.ro.chain.clase;

public class CalatorieMetrou extends CalatorieHandler{
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distantaParcursa) {
        return "Metrou";
    }
}
