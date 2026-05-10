package cts.ase.ro.adapter.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament(){
        System.out.println("S-a achizionat medicamentul "+this.numeMedicament);
    }

}
