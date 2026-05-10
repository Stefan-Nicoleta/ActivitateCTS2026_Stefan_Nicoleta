package main;

import cts.ase.ro.adapter.farmacie.Medicament;
import cts.ase.ro.adapter.spital.MedicamentAdapter;
import cts.ase.ro.facade.Facade;
import cts.ase.ro.facade.Medic;
import cts.ase.ro.facade.Pacient;
import cts.ase.ro.facade.Salon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1. Facade
    //Se apeleaza clasele
        Medic medic = new Medic();
        Salon salon = new Salon();
        Pacient pacient = new Pacient("Nicoleta", 6);

        //Se apeleaza Facade
        Facade facade = new Facade(medic,salon);
        facade.internarePacient(pacient);



    //2. Adapter
        Medicament medicament = new Medicament("Nurofen");
        cts.ase.ro.adapter.spital.Medicament medicament1 = new cts.ase.ro.adapter.spital.Medicament("Nurofen cu reteta",20);

        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicament1);
        medicamentAdapter.cumparaMedicament();
    }
}