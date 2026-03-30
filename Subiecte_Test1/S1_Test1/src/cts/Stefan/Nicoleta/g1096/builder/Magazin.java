package cts.Stefan.Nicoleta.g1096.builder;

public class Magazin {
    //final pentru a nu modifica magazinele
    private final String denumire;
    private final int suprafata;
    private final int nrIntrari;
    private final boolean podeaSpeciala;
    private final int duritatePodeaSpeciala;
    private final TipDecoratiuni tipDecoratiuni;

    public Magazin(String denumire, int suprafata, int nrIntrari, boolean podeaSpeciala, int duritatePodeaSpeciala, TipDecoratiuni tipDecoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podeaSpeciala = podeaSpeciala;
        this.duritatePodeaSpeciala = duritatePodeaSpeciala;
        this.tipDecoratiuni = tipDecoratiuni;


    }

    //eliminare setteri pentru imposibilitatea modificarii magazinului/magazinelor


    public int calculGradIncendiu(){
        int grad = 10- duritatePodeaSpeciala;

       switch (tipDecoratiuni){
           case LEMN: grad +=2; break;
           case STICLA: grad +=5; break;
           case METAL: grad +=10; break;
           default: grad+=0; break;

       }
        return grad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", podeaSpeciala=").append(podeaSpeciala);
        sb.append(", duritatePodeaSpeciala=").append(duritatePodeaSpeciala);
        sb.append(", tipDecoratiuni=").append(tipDecoratiuni);
        sb.append(", grad incendiu=").append(calculGradIncendiu());
        sb.append('}');
        return sb.toString();
    }
}
