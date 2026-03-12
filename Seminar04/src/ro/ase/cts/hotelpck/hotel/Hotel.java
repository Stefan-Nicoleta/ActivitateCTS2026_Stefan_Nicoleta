package ro.ase.cts.hotelpck.hotel;


//Singleton
public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarCamereInchiriate;
    private int numarAngajati;

    public void inchiriazaCamera(){
        if(numarCamereInchiriate >= numarCamere){
            System.out.println("Camere inchiriate complet!");
        }
        else{
            numarCamereInchiriate++; // Incrementăm camerele ocupate
            System.out.println("Camera a fost inchiriata cu succes! Camere rămase: " + (numarCamere - numarCamereInchiriate));
        }
    }


    private Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.numarCamereInchiriate = 0;
        this.numarAngajati = numarAngajati;
    }

    private static Hotel instanta = null;

    public static synchronized Hotel getInstance(String nume, int nrCamere, int nrAngajati){
        if(instanta == null){
            instanta = new Hotel(nume,nrCamere,nrAngajati);
        }
        return instanta;
    }

}
