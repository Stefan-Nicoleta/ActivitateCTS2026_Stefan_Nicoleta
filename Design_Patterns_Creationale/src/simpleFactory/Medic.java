package simpleFactory;

public class Medic implements Personal{
    private int varsta;

    Medic(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
