package singleton.threadsafe;

public class CuptorT {
    private String denumire;
    private int anFabricatie;


    private static CuptorT instanta = null;


    private CuptorT(String denumire, int anFabricatie) {
        this.denumire = denumire;
        this.anFabricatie = anFabricatie;
    }


    public static synchronized CuptorT getInstance(String denumire, int anFabricatie){
        if(instanta == null){
            instanta = new CuptorT(denumire,anFabricatie);
        }
        return instanta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
