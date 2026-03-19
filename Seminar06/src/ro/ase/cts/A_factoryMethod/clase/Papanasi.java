package ro.ase.cts.A_factoryMethod.clase;

public class Papanasi extends Desert{
    public Papanasi(int calorii, double pret, int gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Papanasii: "+super.toString());
    }
}
