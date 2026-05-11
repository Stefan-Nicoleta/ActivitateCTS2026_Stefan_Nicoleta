package cts.ase.ro.adapter.spital;


//Clasa deja existenta - Medicament din cadrul spitalului
public class Medicament {
    private String numeMedicament;
    private int pret;

    public Medicament(String numeMedicament, int pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }



    public boolean prezintaReteta(){
        return numeMedicament.contains("reteta"); //numai asa ne putem da seama daca are reteta sau nu
    }

    //+ metoda();
    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("S-a achizionat medicamentul "+this.numeMedicament+" si are si reteta");
        }
        else{
            System.out.println("Nu are reteta");
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}
