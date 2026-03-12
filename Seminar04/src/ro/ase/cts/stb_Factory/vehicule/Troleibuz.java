package ro.ase.cts.stb_Factory.vehicule;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Troleibuz");
        System.out.println(super.toString());
    }
}
