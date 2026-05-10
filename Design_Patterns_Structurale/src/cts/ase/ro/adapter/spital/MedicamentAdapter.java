package cts.ase.ro.adapter.spital;

import cts.ase.ro.adapter.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {

    private cts.ase.ro.adapter.spital.Medicament medicamentSpital;

    public MedicamentAdapter(cts.ase.ro.adapter.spital.Medicament medicament) {
        super(medicament.getNumeMedicament());
        this.medicamentSpital = medicament;
    }


    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }


}
