package ro.ase.cts.enuminitialization;

public enum AgentieEnum {
    instanta;

    private String numeAgentie;
    private int nrAngajati;

    private AgentieEnum() {
        this.numeAgentie = "AgeTur";
        this.nrAngajati =2;
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
}
