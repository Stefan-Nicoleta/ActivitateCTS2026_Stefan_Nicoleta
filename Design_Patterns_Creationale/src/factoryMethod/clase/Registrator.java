package factoryMethod.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(int varsta) {
        super(varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesta este un Registrator de "+super.varsta);
    }
}
