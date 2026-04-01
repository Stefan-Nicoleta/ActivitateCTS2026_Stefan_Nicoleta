package cts.stefan.nicoleta.g1096.simpleFactory;

public class CameraInaltaRezolutie extends AbstractModule{
    int rezolutie;
    String versiuneCamera;

    CameraInaltaRezolutie(String name, String description, float price, int rezolutie, String versiuneCamera) {
        super(name, description, price);
        this.rezolutie = rezolutie;
        this.versiuneCamera = versiuneCamera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CameraInaltaRezolutie{");
        sb.append("rezolutie=").append(rezolutie);
        sb.append(", versiuneCamera='").append(versiuneCamera).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
