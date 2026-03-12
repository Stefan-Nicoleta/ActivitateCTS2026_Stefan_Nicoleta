package ro.ase.cts.stb_Factory.vehicule;

public class Autobuz extends MijlocTransport{

    public Autobuz(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuz");
        System.out.println(super.toString());
    }
}
