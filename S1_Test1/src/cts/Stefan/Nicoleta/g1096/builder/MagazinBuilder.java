package cts.Stefan.Nicoleta.g1096.builder;

public class MagazinBuilder implements AbstractBuilder {


    private String denumire;
    private int suprafata;
    private int nrIntrari = 1;
    private boolean podeaSpeciala;
    private int duritatePodea;
    private TipDecoratiuni tipDecoratiuni = TipDecoratiuni.NAN;


    public MagazinBuilder() {
    }




    @Override
    public Magazin build() throws Exception {
    //restrictii

    //1
        if(this.nrIntrari * 100<this.suprafata){
            throw new Exception("Numar de intrari insuficient!");
        }

        if(this.duritatePodea < 2 && this.tipDecoratiuni == TipDecoratiuni.STICLA){
            throw new Exception("Sticla nu este permisa!");
        }

        return new Magazin(denumire,suprafata,nrIntrari,podeaSpeciala, duritatePodea, tipDecoratiuni);
    }

    @Override
    public AbstractBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }


    @Override
    public AbstractBuilder setSuprafata(int suprafata) {
        this.suprafata = suprafata;//apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;//apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setPodeaSpeciala(boolean podeaSpeciala) {
        this.podeaSpeciala = podeaSpeciala;//apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setDuritatePodeaSpeciala(int duritate) {
        this.duritatePodea = duritate;//apelare in cascada
        return this; //this in loc de null
    }

    @Override
    public AbstractBuilder setTipDecoratiuni(TipDecoratiuni tipDecoratiuni) {
        this.tipDecoratiuni = tipDecoratiuni;//apelare in cascada
        return this; //this in loc de null
    }



}
