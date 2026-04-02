package factoryMethod.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesta este un asistent numit "+super.denumire);
    }
}
