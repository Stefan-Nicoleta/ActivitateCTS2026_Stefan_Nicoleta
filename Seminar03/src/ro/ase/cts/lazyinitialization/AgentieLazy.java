package ro.ase.cts.lazyinitialization;

public class AgentieLazy {

    //Lazy initialization => initializam instanta cu null
    private String numeAgentie;
    private int nrAngajati;

    private static AgentieLazy instanta = null;

    private AgentieLazy(String numeAgentie, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.nrAngajati = nrAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static AgentieLazy getInstanta(String nume, int nr){
        if(instanta == null){
            instanta = new AgentieLazy(nume,nr);
        }

        return instanta;
    }

}
