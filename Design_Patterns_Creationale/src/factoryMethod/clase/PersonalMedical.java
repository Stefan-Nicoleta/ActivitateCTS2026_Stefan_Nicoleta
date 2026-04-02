package factoryMethod.clase;

public abstract class PersonalMedical implements PersonalSpital {
    String denumire;

    PersonalMedical(String denumire) {
        this.denumire = denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
