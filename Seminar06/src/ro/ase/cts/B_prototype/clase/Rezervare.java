package ro.ase.cts.B_prototype.clase;

public class Rezervare implements PrototypeRezervare{

    private String numeClient;
    private int nrPersoane;
    private String oraRezervare;
    private String numarTelefon;

    public Rezervare(String numeClient, int nrPersoane, String oraRezervare, String numarTelefon) {

        if(numeClient.length()>=3){
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "No Name";
        }
        if (nrPersoane>0){
            this.nrPersoane = nrPersoane;
        }
        else {
            this.nrPersoane = 1;
        }

        this.oraRezervare = oraRezervare;

        if(numarTelefon.length()==10){
            this.numarTelefon = numarTelefon;
        }
        else{
            this.numarTelefon = "+401234567";
        }


    }

    public Rezervare() {
    }


    //setteri pt a nu avea o rezervare la ac ora cu ac nr de persoane
    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.oraRezervare = this.oraRezervare;
        rezervare.numarTelefon = this.numarTelefon;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
