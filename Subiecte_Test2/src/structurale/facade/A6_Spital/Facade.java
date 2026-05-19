package structurale.facade.A6_Spital;

public class Facade {

    private Pacient pacient;
    private Medic medic;


    public void verificareGravitate(){
        if(pacient.getGravitate() > 5){
            if(medic.verificareGravitate(pacient)){
                //...
            }
        }
    }

}
