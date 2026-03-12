package ro.ase.cts.threadsafeinitialization;

public class AgentieThreadSafe {
    private String numeAgentie;
    private int nrAngajati;

    private static AgentieThreadSafe instanta = null;

    private AgentieThreadSafe(String numeAgentie, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized AgentieThreadSafe getInstance(String nume, int nrAngajati){
        if(instanta == null){
            instanta = new AgentieThreadSafe(nume, nrAngajati);
        }
        return instanta;
    }
}
