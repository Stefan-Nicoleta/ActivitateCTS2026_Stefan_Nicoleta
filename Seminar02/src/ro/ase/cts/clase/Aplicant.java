package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    //lowerCamelCase!
    protected int nrProiecte;
    protected String[] denumireProiect;
    public abstract void afisareFinantare();
    private static int pragPunctaj = 80;


    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    //metoda nu are un nume sugestiv (statut). vom modifica in afisareStatut


    //setter in caz ca vrem sa modificam valoarea
//    public static void setPragPunctaj(int pragPunctaj) {
//        Aplicant.pragPunctaj = pragPunctaj;
//    }

    public void afisareStatut(){
        //punctaj>80 => valoarea hardcodata
        //constante multe => adaugare in BD

        //punctaj => atribut al obiectului
        //pragPunctaj => atribut static din Aplicant

        //trebuie adugate acolade sau OPERATORUL TERNAR! (: ?)

        //CAZ 1: {}
        if(this.punctaj>Aplicant.pragPunctaj) {
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        }
        else{
            System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
        }

        //CAZ 2: operatorul ternar
        StringBuilder sb = new StringBuilder("Aplicantul ");
        sb.append(this.nume).append(" ").append(this.prenume).append(" ");
        sb.append((this.punctaj>Aplicant.pragPunctaj? " ":" nu "));
        sb.append("a fost acceptat");

//                //asta e prea lung
//        System.out.println("Aplicantul"+ nume+ " "+prenume +
//                (this.punctaj>Aplicant.pragPunctaj? " ":" nu ")+ "a fost acceptat");
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }




    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public void setNrproiecte(int nr_proiecte, String[] vector) {
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = vector;
    }


    //StringBuilder ->  DRY
    //pt a nu mai scrie acelasi lucru si in Aplicant si in elev!
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}