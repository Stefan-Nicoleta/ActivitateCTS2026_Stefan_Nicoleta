package cts.stefan.nicoleta.g1096.simpleFactory;

public class VedereNoapte extends AbstractModule {
    String distanta;
    String calitate;


    VedereNoapte(String name, String description, float price, String distanta, String calitate) {
        super(name, description, price);
        this.distanta = distanta;
        this.calitate = calitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VedereNoapte{");
        sb.append("distanta='").append(distanta).append('\'');
        sb.append(", calitate='").append(calitate).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
