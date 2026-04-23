package ro.ase.cts.main;

import ro.ase.cts.adapter.spital.Medicament;
import ro.ase.cts.adapter.spital.MedicamentAdapter;
import ro.ase.cts.facade.Medic;
import ro.ase.cts.facade.Pacient;
import ro.ase.cts.facade.ReceptieSpital;
import ro.ase.cts.facade.Salon;


public class Main {
    //Problema 1 - Adapter
    private static void procuraMedicament(ro.ase.cts.adapter.farmacie.Medicament medicament){
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        //asta e primul seminar dupa test!!!!

        Medicament medicamentSpital = new Medicament("reteta Nurofen",12);
        ro.ase.cts.adapter.farmacie.Medicament medicamentFarmacie = new ro.ase.cts.adapter.farmacie.Medicament("Ibuprofen");


       medicamentSpital.achizitioneazaMedicament();
       System.out.println(medicamentSpital.prezintaReteta());
       medicamentFarmacie.cumparaMedicament();

       procuraMedicament(medicamentFarmacie);
       //procuraMedicament(medicamentSpital); //aici nu merge! -> aici aplicam Adapterul



        //Apelam adapterul!
        MedicamentAdapter adapter = new MedicamentAdapter(medicamentSpital);
        procuraMedicament(adapter);

        System.out.println();

        //Problema 2 - Facade
        Medic medic = new Medic();
        Salon salon =new Salon();

        Pacient pacient1 = new Pacient("Amelia",7);
        Pacient pacient2 = new Pacient("Nicoleta",2);
        Pacient pacient3 = new Pacient("MIMI",15);
        Pacient pacient4 = new Pacient("Matcha",6);
        Pacient pacient5 = new Pacient("Matcha",6);
        Pacient pacient6 = new Pacient("Matcha",6);

        ReceptieSpital receptieSpital = new ReceptieSpital(medic,salon);
        receptieSpital.internarePacient(pacient1);
        receptieSpital.internarePacient(pacient2);
        receptieSpital.internarePacient(pacient3);
        receptieSpital.internarePacient(pacient4);
        receptieSpital.internarePacient(pacient5);
        receptieSpital.internarePacient(pacient6);


    }
}