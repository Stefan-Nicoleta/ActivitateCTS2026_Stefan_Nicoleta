package ro.ase.cts.B2.builder;

public class RezervareBuilder implements IBuilder {

   private Rezervare rezervare;

   public RezervareBuilder(){
       rezervare = new Rezervare();
   }


   public RezervareBuilder setNumeClient(String numeClient){
       rezervare.setNumeClient(numeClient);
       return this;
   }

   public RezervareBuilder setPretMinimConumatie(int pretMinimConumatie){
       rezervare.setPretMinimConsumatie(pretMinimConumatie);
       return this;
   }

   public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam){
       rezervare.setAsezareLaGeam(asezareLaGeam);
       return this;
   }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice){
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa){
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbietalaPersonalizata(boolean muzicaAmbietalaPersonalizata){
        rezervare.setMuzicaAmbietalaPersonalizata(muzicaAmbietalaPersonalizata);
        return this;
    }
    public RezervareBuilder setGenMuzica(boolean genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
