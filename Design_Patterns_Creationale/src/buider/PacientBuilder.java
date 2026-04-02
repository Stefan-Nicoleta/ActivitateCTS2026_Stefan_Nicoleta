package buider;

public class PacientBuilder implements IBuilder{
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;

    @Override
    public Pacient build() {
        return new Pacient(patRabatabil,micDejunInclus,papuciCamera);
    }


    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus){
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera){
        this.papuciCamera = papuciCamera;
        return this;
    }


}
