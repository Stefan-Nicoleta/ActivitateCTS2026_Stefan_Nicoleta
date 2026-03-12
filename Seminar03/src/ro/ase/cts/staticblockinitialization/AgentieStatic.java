package ro.ase.cts.staticblockinitialization;

public class AgentieStatic {
    private String numeAgentie;
    private int nr;

    private static AgentieStatic instanta;

    static {
        try{
            instanta = new AgentieStatic();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //constructori etc

    public static AgentieStatic getInstanta(String nume, int nr){
        return instanta;
    }
}
