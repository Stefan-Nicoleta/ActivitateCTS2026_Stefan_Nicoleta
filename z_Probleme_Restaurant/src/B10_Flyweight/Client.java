package B10_Flyweight;

//Starea Permanenta
public class Client implements IRezervare{
   private String numeClient;
   private int nrTelefon;
   private String adresaEmail;

    public Client(String numeClient, int nrTelefon, String adresaEmail) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void detaliiRezervare(Rezervari rezervari) {
        System.out.println("Clientul "+this.numeClient+" a rezervat o masa pe nr de telefon"+this.nrTelefon+" si adresa de mail "+this.adresaEmail+
                "Detalii: "+rezervari.toString());
    }
}
