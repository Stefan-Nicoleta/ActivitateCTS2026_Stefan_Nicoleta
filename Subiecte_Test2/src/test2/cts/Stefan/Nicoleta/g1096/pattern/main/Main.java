package test2.cts.Stefan.Nicoleta.g1096.pattern.main;

import test2.cts.Stefan.Nicoleta.g1096.pattern.observer.*;
import test2.cts.Stefan.Nicoleta.g1096.pattern.proxy.Hala;
import test2.cts.Stefan.Nicoleta.g1096.pattern.proxy.Interfata;

public class Main {
    public static void main(String[] args) {
        UtilajPlaci utilajPlaci = new UtilajPlaci("AVC",50,5,10);
        UtilajPlaci utilajPlaci2 = new UtilajPlaci("AVC2",34,9,60);
        Departament depozitare = new DepartamentDepozitare("Nicoleta");
        Departament financiar = new DepartamentFinanciar("Razvan");
        Departament transport = new DepartamentTransport("Flavia");

        utilajPlaci.abonareDepartament(depozitare);
        utilajPlaci.abonareDepartament(financiar);
        utilajPlaci.abonareDepartament(transport);

        utilajPlaci2.abonareDepartament(financiar);
        utilajPlaci2.abonareDepartament(transport);

        utilajPlaci.notificaDepartamente();
        utilajPlaci2.notificaDepartamente();
        System.out.println();
        utilajPlaci.dezabonareDepartament(financiar);
        utilajPlaci.notificaDepartamente();


        Interfata interfata = new test2.cts.Stefan.Nicoleta.g1096.pattern.proxy.UtilajPlaci("lfdslf",34,6,6);
        Hala hala = new Hala(interfata,6,7,50,6);

        hala.esteTemperaturaOk();
        hala.consumOK();
        hala.proceseazaPlaca();


    }
}
