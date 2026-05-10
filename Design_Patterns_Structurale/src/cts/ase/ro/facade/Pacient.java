package cts.ase.ro.facade;

public class Pacient {
   String numePacient;
   int gravitate;

    public Pacient(String numePacient, int gravitate) {
        this.numePacient = numePacient;
        this.gravitate = gravitate;
    }

    public int getGravitate() {
        return gravitate;
    }
}
