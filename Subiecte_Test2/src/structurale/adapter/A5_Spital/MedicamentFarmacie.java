package structurale.adapter.A5_Spital;


//Clasa Context Nou
public class MedicamentFarmacie {

    private String denumrieMedicament;

    public MedicamentFarmacie(String denumrieMedicament) {
        this.denumrieMedicament = denumrieMedicament;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul "+this.denumrieMedicament+" a fost achizitionat cu succes!");
    }

}
