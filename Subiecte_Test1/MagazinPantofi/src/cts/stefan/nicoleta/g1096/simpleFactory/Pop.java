package cts.stefan.nicoleta.g1096.simpleFactory;

public class Pop implements ListaMesaje {
    @Override
    public void mesajePantofi() {
        System.out.println("Acestia sunt pantofi pop");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pop{");
        sb.append('}');
        return sb.toString();
    }
}
