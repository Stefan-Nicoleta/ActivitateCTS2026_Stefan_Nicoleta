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
import singleton.lazy.Cuptor;
import singleton.registry.clase.Personal;
import singleton.registry.registryul.SingletonRegistry;
import singleton.threadsafe.CuptorT;

import java.util.ArrayList;
import java.util.List;

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
        List<String > lista = new ArrayList<>();

        lista.add("Ceva");
        lista.add("Ceva2");

        IReteta reteta = new Reteta(120,"Nurofen", lista);
        IReteta reteta1 = reteta.clone();

        System.out.println(reteta.toString());
        System.out.println(reteta1.toString());


        //singleton registry
        Personal personal = new singleton.registry.clase.Asistent("Nicoleta");
        Personal personal2 = new singleton.registry.clase.Asistent("Razvan");

        SingletonRegistry.setRegister(1,personal);
        SingletonRegistry.setRegister(2,personal2);
       // SingletonRegistry.setRegister(1,personal2);

        System.out.println(SingletonRegistry.getPersonal(1));



        //lazy singleton
        Cuptor cuptor = Cuptor.getInstance("cel mai nou", 2026);
        Cuptor cuptor2 = Cuptor.getInstance("cel mai vechi", 1990);
        System.out.println(cuptor.toString());
        System.out.println(cuptor2.toString());


        //thread safe

        Thread t1 = new Thread(()->{
            CuptorT c = CuptorT.getInstance("Cuptor electric", 2025);
            System.out.println("Fir de executie 1"+c+" "+System.identityHashCode(c));
        });

        Thread t2 = new Thread(()->{
            CuptorT c2 = CuptorT.getInstance("Cuptor gaz", 2014);
            System.out.println("Fir de executie 2"+c2+" "+System.identityHashCode(c2));
        });

        t1.start();
        t2.start();

    }
}