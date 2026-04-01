package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.simpleFactory.AbstractModule;
import cts.stefan.nicoleta.g1096.simpleFactory.BaterieSuplimentara;
import cts.stefan.nicoleta.g1096.simpleFactory.FabricaModule;
import cts.stefan.nicoleta.g1096.simpleFactory.TipModul;
import cts.stefan.nicoleta.g1096.singleton.DroneConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Singleton
        DroneConnection droneConnection = DroneConnection.getInstance();
        droneConnection.connect("Nicoleta");
        droneConnection.connect("Flavia");
        droneConnection.connect("Mami");

        System.out.println(droneConnection.isConnected("Nicoleta")); //true

        droneConnection.disconnect("Nicoleta");
        System.out.println(droneConnection.isConnected("Nicoleta"));
        droneConnection.viewConnections();


        //Simple Factory
        AbstractModule abstractModule = FabricaModule.createModul(TipModul.BATERIE_SUPLIMENTAARA,"Niko","ceva de vis", 90);
        BaterieSuplimentara baterieSuplimentara1 = new BaterieSuplimentara();

        //asa accesam setteri din clasa concreta folosind fabrica!!!!
        BaterieSuplimentara baterieSuplimentara = (BaterieSuplimentara) abstractModule;
        baterieSuplimentara.setCapacitate(2000);

        System.out.println(abstractModule);

    }
}