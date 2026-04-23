package ro.ase.cts.facade;



//aici implementam facade

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }


    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>4){
            if(medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPatLiber();
                if(patLiber!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" este internat in patul "+salon.getPatLiber());
                    salon.ocupaPat(patLiber);
                }
                else{
                    System.out.println("Nu avem paturi libere");
                }
            }
            else{
                System.out.println("Trebuie bilet de trimitere de la medic");
            }
        }
        else{
            System.out.println("Gravitate minima. Nu trebuie internare");
        }
    }



}
