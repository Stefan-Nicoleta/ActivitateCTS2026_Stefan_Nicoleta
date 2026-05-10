package cts.ase.ro.composite;

public class Sectie implements Structura {
    public String numeSectie;
    public int nrAngajati;

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Nume sectie: " + this.numeSectie + " Nr Angajati:" + this.nrAngajati);
    }

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }
}
