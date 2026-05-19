package cts.ase.ro.flyweight;

//stare permanenta
public class Client implements IRezervare {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    protected Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void detaliiRezervare(Rezervare stareTemporara) {
        System.out.println(stareTemporara.toString());
    }
}
