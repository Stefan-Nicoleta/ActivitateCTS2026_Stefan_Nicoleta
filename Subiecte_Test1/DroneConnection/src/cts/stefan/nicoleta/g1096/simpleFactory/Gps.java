package cts.stefan.nicoleta.g1096.simpleFactory;

public class Gps extends AbstractModule{
    int coordonate;
    String versiune;

    Gps(String name, String description, float price, int coordonate, String versiune) {
        super(name, description, price);
        this.coordonate = coordonate;
        this.versiune = versiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gps{");
        sb.append("coordonate=").append(coordonate);
        sb.append(", versiune='").append(versiune).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
