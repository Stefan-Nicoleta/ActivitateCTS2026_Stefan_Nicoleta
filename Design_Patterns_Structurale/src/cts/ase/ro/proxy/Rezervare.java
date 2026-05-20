package cts.ase.ro.proxy;

//Entitate
public class Rezervare implements  IRezervare{

    private String numeRezervare;

    public Rezervare( String numeRezervare) {

        this.numeRezervare = numeRezervare;
    }

    @Override
    public void aprobareRezervare() {
        System.out.println("Rezervare facuta cu succes pe numele "+this.numeRezervare);
    }
}
