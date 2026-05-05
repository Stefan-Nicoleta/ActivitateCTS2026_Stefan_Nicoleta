package cts.ase.ro.command.clase;

public class Asistenta implements PersonalSpital{

    private String numeA;

    public Asistenta(String numeA) {
        this.numeA = numeA;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta "+this.numeA+" trateaza imediat pacientul "+pacient.getNume());
    }
}
