package A13_Chain;

public class SubObservatie extends StariPacient {


    public String gestioneazaCerere(int stare){
        if(stare >= 5){
            return "SubObservatie";
        }
        else{
            return super.handler.gestioneazaCerere(stare);
        }
    }
}
