package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.simpleFactory.model.FabricaMasina;
import cts.stefan.nicoleta.g1096.simpleFactory.model.TipMasina;
import cts.stefan.nicoleta.g1096.singleton.model.AMasina;
import cts.stefan.nicoleta.g1096.singleton.model.Masina;
import cts.stefan.nicoleta.g1096.singleton.model.Service;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Singleton

        Service service = Service.getInstance("NIKO SRL", 1000);
        Service service2 = Service.getInstance("RAZVAN", 4000);


        Masina masini1 = new Masina("Opel", "Rosu");
        Masina masini2 = new Masina("Mazda", "Rosu");

        service.acceptareMasina(masini1);
        service.eliberareLoc();
        service.acceptareMasina(masini2);





        Masina masini3 = new Masina("Opel", "Galben");
        Masina masini4 = new Masina("Opel", "Rosu");

        service.afisareDescriere();
        service2.afisareDescriere();



        //simple factory
        AMasina aMasina = FabricaMasina.createMasina(TipMasina.SUV);
        AMasina aMasina2 = FabricaMasina.createMasina(TipMasina.SUV);
        AMasina aMasina3 = FabricaMasina.createMasina(TipMasina.SUV);
        AMasina aMasina4 = FabricaMasina.createMasina(TipMasina.SUV);

        aMasina.afisare();
        aMasina2.afisare();
        aMasina3.afisare();
        aMasina4.afisare();
    }
}