package cts.ase.ro.facade;


//Clasa Concreta B
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
