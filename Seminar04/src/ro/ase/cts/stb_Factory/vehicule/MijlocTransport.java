package ro.ase.cts.stb_Factory.vehicule;

public abstract class MijlocTransport {
    private String marca;
    private int linie;

    public MijlocTransport(String marca, int linie) {
        this.marca = marca;
        this.linie = linie;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append('\n');
        sb.append("Linia: ").append(linie).append('\n');
        return sb.toString();
    }
}
