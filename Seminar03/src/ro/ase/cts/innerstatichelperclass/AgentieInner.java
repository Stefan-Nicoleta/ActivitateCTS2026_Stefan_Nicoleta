package ro.ase.cts.innerstatichelperclass;

public class AgentieInner {

    private String nume;
    private int nr;

    private static class AgentieHelper{
        private static final AgentieInner instanta = new AgentieInner();
    }

    public static AgentieInner getInstance(String nume, int nr){
        return AgentieHelper.instanta;
    }

    private AgentieInner() {
        this.nume = "A";
        this.nr = 40;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
