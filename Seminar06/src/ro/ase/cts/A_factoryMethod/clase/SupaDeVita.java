package ro.ase.cts.A_factoryMethod.clase;

public class SupaDeVita extends Supa{
    public SupaDeVita(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de vita: "+super.toString());
    }
}
