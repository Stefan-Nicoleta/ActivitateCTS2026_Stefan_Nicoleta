package A12_Observer;

public class SpitalConcret extends Spital {
    public void notificaVirus(){
        super.notificaPacient("este un virus");
    }

    public void notificaEpidemie(){
        super.notificaPacient("este o epidemie");
    }
}
