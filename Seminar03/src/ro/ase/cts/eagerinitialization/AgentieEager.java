package ro.ase.cts.eagerinitialization;

public class AgentieEager {
    //Singleton: atribute/ instante private
    //getInstanta publica
    //metoda privata

    //scopul singleton este pt a folosi instanta o singura data
    //ex clientii se duc la o singura receptie de hotel
    //nu se creeaza mai multe receptii hoteliere pt mai multi clienti

    private String numeAgentie;
    private int numarAngajati;

    private static final AgentieEager instanta = new AgentieEager();

    private AgentieEager() {
        this.numeAgentie = "AgeTur";
        this.numarAngajati = 5;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieEager getInstance(String nume, int nrAngajati){
        return instanta;
    }
}
