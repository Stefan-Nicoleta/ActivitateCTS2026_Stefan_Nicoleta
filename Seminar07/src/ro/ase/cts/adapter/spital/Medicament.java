package ro.ase.cts.adapter.spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void achizitioneazaMedicament() {
        if(prezintaReteta()){
            System.out.println("Este achizionat medicamentul "+this.numeMedicament+" la pretul: "+this.pretMedicament+" lei.");
        }
        else{
            System.out.println("Pentru medicamentul "+this.numeMedicament+" este nevoie de reteta");
        }
    }

    public boolean prezintaReteta() {
        return numeMedicament.contains("reteta");

    }


    public String getNumeMedicament() {
        return numeMedicament;
    }
}
