package ro.ase.cts.B3.factoryMethod.clase;

public abstract class Desert implements FelDeMancare{

    int nrCalorii;
    int pret;


    @Override
    public void descriereFelDeMancare() {
        System.out.println("Desert: ");
    }
}
