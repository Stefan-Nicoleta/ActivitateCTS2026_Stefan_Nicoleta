package ro.ase.builder02.spital;


public interface AbstractBuilder02 {
//1. Metoda Builder
    Internare build(String nume);


    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setMicDejun(boolean micDejun);
    AbstractBuilder02 setPapuci(boolean papuci);
    AbstractBuilder02 setHalat(boolean halat);


}
