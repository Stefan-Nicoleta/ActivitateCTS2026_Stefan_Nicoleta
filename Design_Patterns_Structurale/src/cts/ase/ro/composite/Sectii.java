package cts.ase.ro.composite;


//NodFrunza
public class Sectii implements IComposite{

    private String numeSectie;
    private int nrAngajati;

    public Sectii(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    //+metodaSpecifica();
    @Override
    public void afiseazaDetalii() {
        System.out.println("Sectia: "+this.numeSectie+" are "+this.nrAngajati+" angajati.");
    }
}
