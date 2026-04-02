package factoryMethod.clase;

public class Medic extends PersonalMedical{

    public Medic(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesta este un medic numit"+ super.denumire);
    }
}
