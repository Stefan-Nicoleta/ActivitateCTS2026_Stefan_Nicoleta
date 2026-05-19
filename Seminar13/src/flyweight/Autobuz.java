package flyweight;


//starea temporara
public class Autobuz {
    private String modelAutobuz;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String modelAutobuz, int anFabricatie, int nrLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
