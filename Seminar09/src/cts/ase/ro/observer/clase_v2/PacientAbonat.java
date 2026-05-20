package cts.ase.ro.observer.clase_v2;

public class PacientAbonat implements Pacient{
    private String numePacient;

    public PacientAbonat(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void notificarePacient(String mesaj) {
        System.out.println("Pacientul "+this.numePacient+" a primit mesajul: "+mesaj);
    }
}
