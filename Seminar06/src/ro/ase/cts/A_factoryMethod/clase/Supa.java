package ro.ase.cts.A_factoryMethod.clase;

public abstract class Supa implements FelDeMancare{
    int gramaj;
    double pret;

    public Supa(int gramaj, double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
