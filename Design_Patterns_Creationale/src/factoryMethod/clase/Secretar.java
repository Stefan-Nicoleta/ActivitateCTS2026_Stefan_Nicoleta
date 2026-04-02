package factoryMethod.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(int varsta) {
        super(varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesta este un secretar cu varsta "+super.varsta);
    }
}
