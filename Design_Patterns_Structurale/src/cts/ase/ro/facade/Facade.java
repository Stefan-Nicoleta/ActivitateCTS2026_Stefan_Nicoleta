package cts.ase.ro.facade;


//Facade
public class Facade {
    //implementare facade
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>4){
            if(medic.trebuieInternat(pacient)){
                int patliber = salon.getPatLiber();
                if(patliber!= -1){
                    System.out.println("Pacientul este internat in patul"+salon.getPatLiber());
                    salon.ocupaPat(patliber);
                }
                else{
                    System.out.println("Nu exista paturi libere");
                }
            }
            else{
                System.out.println("Pacientul nu are nevoie de internare");
            }

        }
        else{
            System.out.println("Pacientul nu este atat de grav ranit. Gravitate minima");
        }
    }

}
