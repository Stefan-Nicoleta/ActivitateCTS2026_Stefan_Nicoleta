package ro.ase.cts.adapter.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament(){
        System.out.println("Este cumparat medicamentul "+this.numeMedicament+" de la farmacie");
    }

}
