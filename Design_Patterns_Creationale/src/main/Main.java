package main;

import buider.Pacient;
import buider.PacientBuilder;
import factoryMethod.clase.PersonalMedical;
import factoryMethod.clase.PersonalSpital;
import factoryMethod.enums.TipMedical;
import factoryMethod.factory.FabricaMedical;
import prototype.IReteta;
import prototype.Reteta;
import simpleFactory.Asistent;
import simpleFactory.FabricaPersonal;
import simpleFactory.TipPersonal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder
        Pacient p = new PacientBuilder().setMicDejunInclus(true).setPatRabatabil(true).build();
        System.out.println(p.toString());
        //simple factory
        Asistent asistent = (Asistent) FabricaPersonal.createPersonal(TipPersonal.ASISTENT);
        System.out.println(asistent);

        //factory method
        FabricaMedical fabricaMedical = new FabricaMedical();
        PersonalSpital personalSpital = fabricaMedical.createMedical(TipMedical.MEDIC);


        PersonalMedical personalMedical = fabricaMedical.createMedical(TipMedical.MEDIC);
        personalMedical.setDenumire("Altceva");
        personalMedical.afiseaza();


        //prototype
        IReteta reteta = new Reteta(120,"Nurofen");
        IReteta reteta1 = reteta.clone();

        System.out.println(reteta.toString());
        System.out.println(reteta1.toString());





    }
}