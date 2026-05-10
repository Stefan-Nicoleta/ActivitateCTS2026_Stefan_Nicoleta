package ro.ase.cts.adapter.spital;

import ro.ase.cts.adapter.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {

    private ro.ase.cts.adapter.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.ase.cts.adapter.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();

    }
}
