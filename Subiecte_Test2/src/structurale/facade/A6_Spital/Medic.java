package structurale.facade.A6_Spital;

public class Medic {
    public boolean verificareGravitate(Pacient pacient){
        return pacient.getGravitate() >5;
    }
}
