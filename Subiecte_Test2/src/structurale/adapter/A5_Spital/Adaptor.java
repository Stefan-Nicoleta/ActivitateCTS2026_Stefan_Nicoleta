package structurale.adapter.A5_Spital;

public class Adaptor extends MedicamentFarmacie{
    private MedicamenteSpital medicamenteSpital;

    public Adaptor(String denumrieMedicament, MedicamenteSpital medicamenteSpital) {
        super(denumrieMedicament);
        this.medicamenteSpital = medicamenteSpital;
    }

    public void cumparaMedicament(){
        medicamenteSpital.achizitioneazaMedicament();
    }


}
