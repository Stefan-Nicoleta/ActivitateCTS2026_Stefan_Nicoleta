package ro.ase.builder01.spital;

public class InternareBuilder implements AbstractBuilder {

    private Internare internare;

    //cream un constructor
    public InternareBuilder(String nume) {
       internare = new Internare(nume, false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare; //returnam internarea in loc de null
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNumePacient(nume); //apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);//apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.internare.setMicDejunInclus(micDejun);//apelare in cascada
        return this;//this in loc de null
    }

    @Override
    public AbstractBuilder setPapuci(boolean papuci) {
        this.internare.setPapuciDeCamera(papuci);//apelare in cascada
        return this;//this in loc de null
    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
        this.internare.setHalat(halat);//apelare in cascada
        return this;//this in loc de null
    }


}
