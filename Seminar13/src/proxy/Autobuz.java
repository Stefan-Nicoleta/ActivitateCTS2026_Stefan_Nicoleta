package proxy;


//Entitatea
public class Autobuz implements MijlocTransport{
    private String linie;
    private int nrCalatori;


    //+metodaa(): void
    @Override
    public void oprireStatie() {
        System.out.println("Autobuzul de pe linia " + this.linie + " s-a oprit in statie");
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public String getLinie() {
        return linie;
    }

    public Autobuz(String linie, int nrCalatori) {
        this.linie = linie;
        this.nrCalatori = nrCalatori;
    }
}
