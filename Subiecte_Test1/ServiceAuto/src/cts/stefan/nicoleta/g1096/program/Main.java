package cts.stefan.nicoleta.g1096.program;

import cts.stefan.nicoleta.g1096.singleton.model.*;

public class Main {
    public static void main(String[] args) {
        ServiceAuto serviceAuto = ServiceAuto.getInstance("Dristor",120,"20-02-2026");
        ServiceAuto serviceAuto2 = ServiceAuto.getInstance("a",1,"20-02-2025"); //este creata o singura instanta!

        Masina masina = new Masina("Opel","rosu");
        Masina masina2 = new Masina("Mazda","albastru");
        Masina masina3 = new Masina("Tesla","alba");
        Masina masina4 = new Masina("Mercedes","rosu");

        serviceAuto.primesteMasina(masina);
        serviceAuto.primesteMasina(masina2);
        serviceAuto.primesteMasina(masina3);
        serviceAuto.primesteMasina(masina4);

        System.out.println(serviceAuto.toString());
        System.out.println(serviceAuto2.toString());


        AMasina masina5 = FabricaMasina.createMasina(TipMasina.SUV, "Opel","Rosu");
        System.out.println(masina5);

    }
}