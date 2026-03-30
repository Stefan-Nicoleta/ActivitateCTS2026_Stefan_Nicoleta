package cts.Stefan.Nicoleta.g1096.builder;

public interface AbstractBuilder {

    Magazin build() throws Exception;

    AbstractBuilder setDenumire(String denumire);

    AbstractBuilder setSuprafata(int suprafata);

    AbstractBuilder setNrIntrari(int nrIntrari);

    AbstractBuilder setPodeaSpeciala(boolean podeaSpeciala);

    AbstractBuilder setDuritatePodeaSpeciala(int duritate);

    AbstractBuilder setTipDecoratiuni(TipDecoratiuni tipDecoratiuni);
}
