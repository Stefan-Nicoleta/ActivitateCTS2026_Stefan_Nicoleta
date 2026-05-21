package main;

import A10_FlyWeight.FlyweightFactory;
import A10_FlyWeight.IPacient;
import A10_FlyWeight.Salon;
import A11_Strategy.IPlata;
import A11_Strategy.PlataCard;
import A11_Strategy.PlataCash;
import A12_Observer.PacientAnuntat;
import A12_Observer.Spital;
import A12_Observer.SpitalConcret;
import A13_Chain.Externat;
import A13_Chain.Internat;
import A13_Chain.StariPacient;
import A13_Chain.SubObservatie;
import A8_Composite.Departament;
import A8_Composite.IDepartamente;
import A8_Composite.Sectii;
import A9_Proxy.ISpital;
import A9_Proxy.Pacient;
import A9_Proxy.PacientCuAsigurare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Proxy
//        ISpital iSpital = new Pacient("Nicoleta");
//        ISpital pacientCuAsigurare = new PacientCuAsigurare(iSpital,true);
//        pacientCuAsigurare.verificareAsigurare();
//
//        //Flyweight
//        FlyweightFactory flyweightFactory = new FlyweightFactory();
//        Salon salon = new Salon(5,6);
//        IPacient iPacient = flyweightFactory.getDetaliiPacient("Nicoleta",894);
//        IPacient iPacient2 = flyweightFactory.getDetaliiPacient("LILI",894);
//        iPacient.retinereInformatii(salon);
//        iPacient2.retinereInformatii(salon);
//        iPacient.retinereInformatii(salon);
//        iPacient2.retinereInformatii(salon);
//
//        //Strategy
//        IPlata iPlata = new PlataCard();
//        IPlata iPlata2 = new PlataCash();
//        iPlata.alegeModDePlata();
//        iPlata2.alegeModDePlata();
//
//        //Observer
//       SpitalConcret spitalConcret = new SpitalConcret();
//
//
//        PacientAnuntat pacient1 = new PacientAnuntat("Nicoleta");
//        PacientAnuntat pacient2 = new PacientAnuntat("Bibi");
//        PacientAnuntat pacient3 = new PacientAnuntat("Mimi");
//       spitalConcret.abonarePacienti(pacient1);
//       spitalConcret.abonarePacienti(pacient2);
//       spitalConcret.abonarePacienti(pacient3);
//
//       spitalConcret.notificaVirus();
//       spitalConcret.notificaEpidemie();
//


       //Chain

        StariPacient stariPacient1 = new Internat();
        StariPacient stariPacient2 = new SubObservatie();
        StariPacient stariPacient3 = new Externat();

        stariPacient1.setHandler(stariPacient2);
        stariPacient2.setHandler(stariPacient3);


        System.out.println(stariPacient1.gestioneazaCerere(0));


        //Composite
        Departament iDepartamente = new Departament("IT");
        Sectii sectia1 = new Sectii("A");
        Sectii sectia2 = new Sectii("B");
        Sectii sectia3 = new Sectii("C");

        iDepartamente.adaugaNod(sectia1);
        iDepartamente.adaugaNod(sectia2);
        iDepartamente.adaugaNod(sectia3);

        iDepartamente.afiseazaSectii();

        iDepartamente.stergeNod(sectia3);
        iDepartamente.afiseazaSectii();

        


    }
}