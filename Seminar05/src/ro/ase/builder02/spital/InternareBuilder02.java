package ro.ase.builder02.spital;


public class InternareBuilder02 implements AbstractBuilder02{

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,patRabatabil,micDejunInclus,papuciDeCamera,halat);
    }


    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejun(boolean micDejun) {
        this.micDejunInclus = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuci(boolean papuci) {
        this.papuciDeCamera = papuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
}
