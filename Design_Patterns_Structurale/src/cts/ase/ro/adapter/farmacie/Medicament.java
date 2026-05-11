package cts.ase.ro.adapter.farmacie;

//Clasa cea noua - Medicament din cadrul farmaciei
public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    //+ metodaNoua();
    //asemanatoare cu +metoda();
    public void cumparaMedicament(){
        System.out.println("S-a achizionat medicamentul "+this.numeMedicament);
    }

}
