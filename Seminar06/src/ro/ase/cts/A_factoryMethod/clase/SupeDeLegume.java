package ro.ase.cts.A_factoryMethod.clase;

public class SupeDeLegume extends Supa {


    public SupeDeLegume(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de legume: "+super.toString());
    }
}
