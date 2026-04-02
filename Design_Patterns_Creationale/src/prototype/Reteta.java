package prototype;

public class Reteta implements IReteta{
    int cantitati;
    String denumireMedicament;

     public Reteta(int cantitati, String denumireMedicament) {
         System.out.println("Creare o sg data");
        this.cantitati = cantitati;
        this.denumireMedicament = denumireMedicament;
    }

    Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitati=").append(cantitati);
        sb.append(", denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IReteta clone() {
        Reteta reteta = new Reteta();
        reteta.cantitati = this.cantitati;
        reteta.denumireMedicament = this.denumireMedicament;
        return reteta;
    }


}
