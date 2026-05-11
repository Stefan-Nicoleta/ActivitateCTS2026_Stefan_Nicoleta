package cts.ase.ro.adapter.spital;

import cts.ase.ro.adapter.farmacie.Medicament;

//Adapterul
public class MedicamentAdapter extends Medicament {

    //- ClasaExistenta clasa;
    private cts.ase.ro.adapter.spital.Medicament medicamentSpital;

    public MedicamentAdapter(cts.ase.ro.adapter.spital.Medicament medicament) {
        super(medicament.getNumeMedicament());
        this.medicamentSpital = medicament;
    }


    // + metodaNoua();
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }


}
