package singleton.lazy;

public class Cuptor {
    private String denumire;
    private int anFabricatie;


    private static Cuptor instanta = null;


    private Cuptor(String denumire, int anFabricatie) {
        this.denumire = denumire;
        this.anFabricatie = anFabricatie;
    }


    public static Cuptor getInstance(String denumire, int anFabricatie){
        if(instanta == null){
            instanta = new Cuptor(denumire,anFabricatie);
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
