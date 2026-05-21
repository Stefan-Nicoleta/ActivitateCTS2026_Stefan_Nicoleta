package A13_Chain;

public class Internat extends StariPacient {

    @Override
    public void setHandler(StariPacient handler) {
        super.setHandler(handler);
    }

    public String gestioneazaCerere(int stare){
        if(stare == 0){
            return "Internat";
        }
        else{
            return super.handler.gestioneazaCerere(stare);
        }
    }
}
