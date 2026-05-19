package main;

import cts.ase.ro.adapter.farmacie.Medicament;
import cts.ase.ro.adapter.spital.MedicamentAdapter;
import cts.ase.ro.composite.Departamente;
import cts.ase.ro.composite.IComposite;
import cts.ase.ro.composite.Sectii;
import cts.ase.ro.decorator.clase.INotaDePlata;
import cts.ase.ro.decorator.clase.NotaDePlata;
import cts.ase.ro.decorator.decorator.DecoratorNotaDePlata;
import cts.ase.ro.decorator.decorator.NotaDePlataRevelion;
import cts.ase.ro.decorator.decorator.NotaDePlataZiDeNastere;
import cts.ase.ro.facade.Facade;
import cts.ase.ro.facade.Medic;
import cts.ase.ro.facade.Pacient;
import cts.ase.ro.facade.Salon;
import cts.ase.ro.flyweight.Client;
import cts.ase.ro.flyweight.FlyweightFactory;
import cts.ase.ro.flyweight.IRezervare;
import cts.ase.ro.flyweight.Rezervare;



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



    //3. Decorator
        INotaDePlata iNotaDePlata = new NotaDePlata();
        iNotaDePlata.printeazaNota();


        DecoratorNotaDePlata decoratorNotaDePlata = new NotaDePlataZiDeNastere();
        DecoratorNotaDePlata decoratorNotaDePlata2 = new NotaDePlataRevelion();
        decoratorNotaDePlata.printeazaFelicitare();
        decoratorNotaDePlata2.printeazaFelicitare();

    //5. Composite
        IComposite iSpital = new Departamente("Spital");
        IComposite iAdministrativ = new Departamente("Administrativ");
        IComposite iSecretariat = new Sectii("Secretariat",10);

        ((Departamente) iSpital).adaugaNod(iAdministrativ);
        ((Departamente) iSpital).adaugaNod(iSecretariat);

        iSpital.afiseazaDetalii();

        ((Departamente) iSpital).stergeNod(iSecretariat);
        iSpital.afiseazaDetalii();
        ((Departamente) iSpital).adaugaNod(iAdministrativ);
        iSpital.afiseazaDetalii();

        //Flyweight
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Rezervare rezervare = new Rezervare(5,4,"aaa");
        Rezervare rezervare1 = new Rezervare(10,2,"llala");


        IRezervare iRezervare = flyweightFactory.getDateClient("Nicoleta","0907","nak");
        iRezervare.detaliiRezervare(rezervare);

        IRezervare iRezervare2 = flyweightFactory.getDateClient("Nicoleta","0907","nak");
        iRezervare2.detaliiRezervare(rezervare1);


        IRezervare iRezervare3 = flyweightFactory.getDateClient("k","0907","nak");
        iRezervare3.detaliiRezervare(rezervare1);








    }
}