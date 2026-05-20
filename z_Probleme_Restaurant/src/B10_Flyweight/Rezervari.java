package B10_Flyweight;


//Starea temporara
public class Rezervari {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Rezervari(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervari{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
