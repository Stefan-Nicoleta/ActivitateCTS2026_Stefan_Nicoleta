package ro.ase.cts.stb_Factory.vehicule;

public class Tramvai extends MijlocTransport{

    public Tramvai(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tramvai");
        System.out.println(super.toString());
    }
}
