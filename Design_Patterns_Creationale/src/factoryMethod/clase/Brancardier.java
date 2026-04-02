package factoryMethod.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesta este un brancardier numit "+super.denumire);
    }
}
