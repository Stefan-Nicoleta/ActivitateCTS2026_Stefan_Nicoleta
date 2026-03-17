package ro.ase.builder01.spital;

public interface AbstractBuilder {
//1. Metoda Builder
    Internare build();

    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuci(boolean papuci);
    AbstractBuilder setHalat(boolean halat);


}
