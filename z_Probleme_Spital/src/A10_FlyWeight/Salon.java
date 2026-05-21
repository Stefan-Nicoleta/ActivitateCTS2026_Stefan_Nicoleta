package A10_FlyWeight;

public class Salon {
    private int nrSalon;
    private int nrPaturi;

    public Salon(int nrSalon, int nrPaturi) {
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPaturi() {
        return nrPaturi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPaturi=").append(nrPaturi);
        sb.append('}');
        return sb.toString();
    }
}
