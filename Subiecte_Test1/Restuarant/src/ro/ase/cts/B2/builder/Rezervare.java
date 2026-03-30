package ro.ase.cts.B2.builder;

public class Rezervare {

    String numeClient;
    int pretMinimConsumatie;

    boolean asezareLaGeam;
    boolean scauneErgonomice;
    boolean decorareMasa;
    boolean muzicaAmbietalaPersonalizata;
    boolean genMuzica; //ma mai gandesc aici


    public Rezervare(String numeClient, int pretMinimConsumatie, boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbietalaPersonalizata, boolean genMuzica) {
        this.numeClient = numeClient;
        this.pretMinimConsumatie = pretMinimConsumatie;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbietalaPersonalizata = muzicaAmbietalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public Rezervare() {
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getPretMinimConsumatie() {
        return pretMinimConsumatie;
    }

    public void setPretMinimConsumatie(int pretMinimConsumatie) {
        this.pretMinimConsumatie = pretMinimConsumatie;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public boolean isMuzicaAmbietalaPersonalizata() {
        return muzicaAmbietalaPersonalizata;
    }

    public void setMuzicaAmbietalaPersonalizata(boolean muzicaAmbietalaPersonalizata) {
        this.muzicaAmbietalaPersonalizata = muzicaAmbietalaPersonalizata;
    }

    public boolean isGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", pretBilet=").append(pretMinimConsumatie);
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbietalaPersonalizata=").append(muzicaAmbietalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }



}
