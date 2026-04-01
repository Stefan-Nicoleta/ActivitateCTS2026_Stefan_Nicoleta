package cts.stefan.nicoleta.g1096.simpleFactory;

public class BaterieSuplimentara extends AbstractModule{
    int capacitate;
    String marime;

     BaterieSuplimentara(String name, String description, float price, int capacitate, String marime) {
        super(name, description, price);
        this.capacitate = capacitate;
        this.marime = marime;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaterieSuplimentara{");
        sb.append("capacitate=").append(capacitate);
        sb.append(", marime='").append(marime).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
