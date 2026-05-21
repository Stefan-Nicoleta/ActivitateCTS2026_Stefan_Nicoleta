package A13_Chain;



public class Externat extends StariPacient{

    @Override
    public void setHandler(StariPacient handler) {
        super.setHandler(handler);
    }

    public String gestioneazaCerere(int stare){
        if(stare < 5 && stare!=0){
            return "Externat";
        }
        else{
           return super.handler.gestioneazaCerere(stare);
        }
    }
}
