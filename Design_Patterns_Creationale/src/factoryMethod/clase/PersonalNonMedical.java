package factoryMethod.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    int varsta;

     PersonalNonMedical(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
